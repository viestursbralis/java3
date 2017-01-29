package lv.javaguru.java3.core.services.clients;

/**
 * Created by Viesturs on 28-Jan-17.
 */
import lv.javaguru.java3.config.MessagingApplication;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CustomMessageListener {

    private static final Logger log = LoggerFactory.getLogger(CustomMessageListener.class);

    @RabbitListener(queues = MessagingApplication.QUEUE_GENERIC_NAME)
    public void receiveMessage(final Message message) {
        log.info("Received message as generic: {}", message.toString());
    }

    @RabbitListener(queues = MessagingApplication.QUEUE_SPECIFIC_NAME)
    public void receiveMessage(final ClientDTO clientDTO) {
        log.info("Received message as specific class: {}", clientDTO.toString());
    }

    @RabbitListener(queues = MessagingApplication.QUEUE_SPECIFIC_NAME)
    public void receiveMessage(final Client client) {
        log.info("Received message as specific class: {}", client.toString());
    }
}
