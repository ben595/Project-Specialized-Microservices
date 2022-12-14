package com.hoang.Service2A;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service2AApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service2AApplication.class, args);
	}

}
