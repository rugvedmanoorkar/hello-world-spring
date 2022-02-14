package com.spinghelloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		GreeterInterface obj = (GreeterInterface) context.getBean("greeter");
		System.out.println(obj.getGreeting());
	}

}
