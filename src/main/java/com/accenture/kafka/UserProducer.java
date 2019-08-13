package com.accenture.kafka;

import com.accenture.avro.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {
    @Value("${spring.kafka.topic}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void send(User user) {
        kafkaTemplate.send(topicName, user);
    }
}
