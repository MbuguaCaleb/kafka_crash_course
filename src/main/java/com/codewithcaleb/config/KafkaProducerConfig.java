package com.codewithcaleb.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;


//It will produce a stream of events and send them to MyTopic
@Configuration
public class KafkaProducerConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    //setting up a Producer Config
    //i must have a URL to my server
    //the producer has the Key and Value of what i am sending
    public Map<String, Object> producerConfig(){
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return props;
    }

    //Producer Factory is Responsible for Creating Producer Instances
    //What is inside the Generic is the Type of What i am sending
    @Bean
    public ProducerFactory<String,String> producerFactory (){
        return new DefaultKafkaProducerFactory<>(producerConfig());
    }

    //Once i SetUp my Producer Factory the next is to configure a way of sending messages via
    //the KAFKA Template
    @Bean
    public KafkaTemplate<String,String> kafkaTemplate(
            ProducerFactory<String,String> producerFactory
    ){
        return new KafkaTemplate<>(producerFactory);
    }

}
