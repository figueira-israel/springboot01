package com.valhallatech.springboot01.springboot01;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class Springboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot01Application.class, args);
		
	}

}
