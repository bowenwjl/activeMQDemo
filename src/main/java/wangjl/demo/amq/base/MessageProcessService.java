package wangjl.demo.amq.base;

/**
 * 消息处理服务
 * 
 * @author wangjl
 *
 */
public interface MessageProcessService
{
    public void processMessage(TestMessage message);
}
