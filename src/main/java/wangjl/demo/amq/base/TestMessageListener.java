package wangjl.demo.amq.base;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.listener.SessionAwareMessageListener;

/**
 * JMS消息监听器
 * 
 * @author wangjl
 *
 */
public class TestMessageListener implements SessionAwareMessageListener<ObjectMessage>
{
    private static Logger LOG = LoggerFactory.getLogger(TestMessageListener.class);

    /** 监听的Queue名称 */
    private String queueName;

    /** 消息处理服务 */
    private MessageProcessService messageProcessService;

    public void onMessage(ObjectMessage message, Session session) throws JMSException
    {
        LOG.info("Received one message from queue[{}]", queueName);
        try
        {
            // 忽略重新投递的消息
            if (message.getJMSDeliveryMode() == DeliveryMode.NON_PERSISTENT)
            {
                if (message.getJMSRedelivered())
                {
                    LOG.warn("Ignore redelivered non persistent message.");
                    return;
                }
            }
            TestMessage requestMessage = (TestMessage) message.getObject();
            LOG.info("Message info:{}", requestMessage);
            messageProcessService.processMessage(requestMessage);
        }
        catch (JMSException e)
        {
            LOG.error(e.getMessage(), e);
            throw e;
        }
        catch (Exception e)
        {
            LOG.error(e.getMessage(), e);
        }

    }

    public String getQueueName()
    {
        return queueName;
    }

    public void setQueueName(String queueName)
    {
        this.queueName = queueName;
    }

    public MessageProcessService getMessageProcessService()
    {
        return messageProcessService;
    }

    public void setMessageProcessService(MessageProcessService messageProcessService)
    {
        this.messageProcessService = messageProcessService;
    }

}
