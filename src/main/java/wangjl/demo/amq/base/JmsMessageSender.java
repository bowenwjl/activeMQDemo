package wangjl.demo.amq.base;

/**
 * JMS消息发送器
 * 
 * @author wuwc
 *
 * @param <M> 发送的消息类型
 */
public interface JmsMessageSender<M>
{
    /**
     * 发送消息到指定的queue
     * 
     * @param message
     * @param queueName
     */
    public void sendMessage(M message, String queueName);
}
