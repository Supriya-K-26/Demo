package com.example.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	/*public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);

		System.out.println(context.getBeanDefinitionCount());


		System.out.println(context.getApplicationName());
		Arrays.stream(context.getBeanDefinitionNames()).forEach(k->{
			System.out.println("the value is :"+k);
		});

NewTopic a= (NewTopic) context.getBean("createTopic");
a.name();
		System.out.println("Topic bean: "+  context.getBean("createTopic"));

	}*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
