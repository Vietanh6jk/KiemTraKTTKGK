package com.example.CAU_2.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
@Component
@Service
public class ConmuserService {
	 @Value("${spring.activemq.queue}")
	    String queue;

	    @JmsListener(destination = "myQueue")
	    @SendTo("myQueue2")
	    public String getOrder(final Message jsonMessage) throws JMSException {
	        String messageData = null;
	        System.out.println("Received message " + jsonMessage);
	        if(jsonMessage instanceof TextMessage) {
	            TextMessage textMessage = (TextMessage)jsonMessage;
	            messageData = textMessage.getText();
	            System.out.println("messageData:"+messageData);
	        }
	        return messageData;
	    }
}
