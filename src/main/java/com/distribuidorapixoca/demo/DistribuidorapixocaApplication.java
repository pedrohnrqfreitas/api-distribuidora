package com.distribuidorapixoca.demo;

import com.distribuidorapixoca.demo.model.Pod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EntityScan("com.distribuidorapixoca.demo.*")
public class DistribuidorapixocaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistribuidorapixocaApplication.class, args);
	}

}
