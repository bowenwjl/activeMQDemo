package wangjl.demo.amq.base;


/**
 * 消息处理具体实现类
 * 
 * @author wangjl
 * 
 */
public class MessageRequestProcessServiceImpl implements MessageProcessService
{
    // private static final Logger LOG =
    // LoggerFactory.getLogger(MessageProcessServiceImpl.class);

    private TestMessageSender testMessageSender;


    public void processMessage(TestMessage message)
    {
        // TestIpp.sendIpp(message);
        testMessageSender.sendMessage(message, "sts.test.responseQueue");
    }


    public void setTestMessageSender(TestMessageSender testMessageSender)
    {
        this.testMessageSender = testMessageSender;
    }

}
