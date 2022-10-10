package com.example.CAU_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.CAU_2.service.ConmuserService;
import com.example.CAU_2.service.ProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;

@SpringBootApplication
public class Cau2Application {

	public static void main(String[] args) throws JsonProcessingException {
		ConfigurableApplicationContext appContext =SpringApplication.run(Cau2Application.class, args);
		ProducerService producerService = appContext.getBean(ProducerService.class);
		producerService.sendToQueue();
		
		ConmuserService conmuserService= appContext.getBean(ConmuserService.class);
	}

}
