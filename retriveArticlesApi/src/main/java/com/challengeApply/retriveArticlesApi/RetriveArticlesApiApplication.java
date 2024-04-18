package com.challengeApply.retriveArticlesApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RetriveArticlesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetriveArticlesApiApplication.class, args);
	}

}
