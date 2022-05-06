package com.supermarket.SupermarketappOrdermsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SupermarketappOrderMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketappOrderMsApiApplication.class, args);
		System.out.println("hai");
	}

}
