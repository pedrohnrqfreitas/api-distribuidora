package com.distribuidorapixoca.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.distribuidorapixoca.demo.*")
public class DistribuidorapixocaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistribuidorapixocaApplication.class, args);
	}

}
