package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerApplication3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication3Application.class, args);
		System.out.println("SpringBootEurekaServerApplication3Application is started..");
	}

}
