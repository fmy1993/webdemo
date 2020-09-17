package com.goose.zhongkai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.goose.zhongkai")
@EntityScan("com.goose.zhongkai")

public class GoosemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoosemanagementApplication.class, args);
	}

}
