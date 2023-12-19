package com.simplilearn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SimplilearnSpringCloudEurikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplilearnSpringCloudEurikaApplication.class, args);
	}

}
