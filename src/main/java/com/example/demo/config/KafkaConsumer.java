package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics="MY-FIRST-TOPIC",groupId = "myGroup")
    public void subscribeTheMesaage(String message)
    {
        LOGGER.info(String.format("Message sent %s", message));
    }
}
