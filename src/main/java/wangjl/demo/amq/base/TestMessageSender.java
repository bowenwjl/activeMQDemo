package wangjl.demo.amq.base;

import java.util.UUID;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/**
 * TestMessage JMS消息发送器实现
 * 
 * @author wangjl
 *
 */
public class TestMessageSender implements JmsMessageSender<TestMessage>
{
    private static final Logger LOG = LoggerFactory.getLogger(TestMessageSender.class);

    /** spring jms template */
    private JmsTemplate jmsTemplate;

    public void sendMessage(final TestMessage message, String queueName)
    {
        LOG.info("Send one message: {} to queue: {}", message, queueName);

        jmsTemplate.send(queueName, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException
            {
                Message objectMessage = session.createObjectMessage(message);
                String correlationID = UUID.randomUUID().toString();
                objectMessage.setJMSCorrelationID(correlationID);
                objectMessage.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);
                objectMessage.setJMSPriority(Message.DEFAULT_PRIORITY);
                return objectMessage;
            }
        });

    }

    public void setJmsTemplate(JmsTemplate jmsTemplate)
    {
        this.jmsTemplate = jmsTemplate;
    }

}
