package wangjl.demo.amq.base;

public class MessageResponseProcessServiceImpl implements MessageProcessService
{

    public void processMessage(TestMessage message)
    {
        long cost = (System.currentTimeMillis() - message.getBeginTime()) / 1000;
        System.out.println("收到响应，本批次总耗时:" + cost + "秒." + message.getTraceNum() + "|" + message.getRespCode() + "|"
                + message.getRespMsg());
    }

}
