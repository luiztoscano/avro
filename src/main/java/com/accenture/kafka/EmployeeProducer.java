package com.accenture.kafka;

import com.accenture.avro.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProducer {
    @Value("${spring.kafka.topic}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    public void send(Employee employee) {
        kafkaTemplate.send(topicName, employee);
    }
}
