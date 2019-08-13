package com.accenture.kafka;

import com.accenture.avro.BoletoNaoSimulado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class BoletoNaoSimuladoProducer {
    @Value("${spring.kafka.topic}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, BoletoNaoSimulado> kafkaTemplate;

    public void send(BoletoNaoSimulado boletoNaoSimulado) {
        kafkaTemplate.send(topicName, boletoNaoSimulado);
    }
}
