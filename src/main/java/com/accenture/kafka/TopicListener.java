package com.accenture.kafka;

import com.accenture.avro.BoletoNaoSimulado;
import com.accenture.avro.Employee;
import com.accenture.avro.User;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "${spring.kafka.topic}", groupId = "${spring.kafka.group-id}")
public class TopicListener {

    @KafkaHandler
    public void listen(User user, Acknowledgment ack) {
        System.out.println(user);

        ack.acknowledge();
    }

    @KafkaHandler
    public void listen(Employee employee, Acknowledgment ack) {
        System.out.println(employee);

        ack.acknowledge();
    }

    @KafkaHandler
    public void listen(BoletoNaoSimulado boletoNaoSimulado, Acknowledgment ack) {
        System.out.println(boletoNaoSimulado);

        ack.acknowledge();
    }

}
