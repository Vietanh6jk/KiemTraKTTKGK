package com.example.CAU_2.service;

import com.example.CAU_2.entity.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.TextMessage;

@Component
@Service
public class ProducerService {

    @Value("${spring.activemq.queue}")
    String queue;

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendToQueue() throws JsonProcessingException {
        try {
            Order order = new Order("191","Banhang","40000");
            String jsonObj = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(order);
            jmsTemplate.send(queue, messageCreator -> {
                TextMessage message = messageCreator.createTextMessage();
                message.setText(jsonObj);
                return message;
            });
        }
        catch (Exception ex) {
            System.out.println("ERROR in sending message to queue");
        }
    }

}	
