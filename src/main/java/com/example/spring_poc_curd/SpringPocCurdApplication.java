package com.example.spring_poc_curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan  (basePackages = {"courierservice","com.example.spring_poc_curd"})
@EntityScan  ("courierservice")
@EnableJpaRepositories  ("courierservice")
public class SpringPocCurdApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringPocCurdApplication.class, args);
	}

}
