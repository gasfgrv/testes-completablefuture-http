package com.github.gasfgrv.testescompletablefuturehttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TestesCompletablefutureHttpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestesCompletablefutureHttpApplication.class, args);
	}

}
