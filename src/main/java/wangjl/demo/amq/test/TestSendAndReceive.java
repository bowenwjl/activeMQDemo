package wangjl.demo.amq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wangjl.demo.amq.base.TestMessage;
import wangjl.demo.amq.base.TestMessageSender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "../conf/amqClient.xml")
public class TestSendAndReceive
{
    private String queueName = "sts.test.requestQueue";
    private TestMessageSender testMessageSender;

    @Test
    public void test() throws Exception
    {
        System.out.println("开始发送10000条数据.");
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
        {
            testMessageSender.sendMessage(createTestMessage(i, currentTime), queueName);
        }
        long costTime = (System.currentTimeMillis() - currentTime) / 1000;
        System.out.println("发送总用时:" + costTime + "秒.");
        while (true)
        {
            Thread.sleep(1000L);
        }
    }

    private TestMessage createTestMessage(int i, long beginTime)
    {
        TestMessage message = new TestMessage();
        message.setAttr1("1");
        message.setAttr2("2");
        message.setAttr3("3");
        message.setAttr4("4");
        message.setAttr5("5");
        message.setAttr6("6");
        message.setAttr7("7");
        message.setAttr8("8");
        message.setAttr9("9");
        message.setAttr10("10");
        message.setTraceNum("20141027-TEST-" + i);
        message.setBeginTime(beginTime);
        return message;
    }

    @Autowired
    public void setTestMessageSender(TestMessageSender testMessageSender)
    {
        this.testMessageSender = testMessageSender;
    }

}
