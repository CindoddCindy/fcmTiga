package com.fmctiga.fcmtiga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
@EnableScheduling
public class FcmtigaApplication {

	public static final Logger logger = LoggerFactory.getLogger("com.fcmtiga.fcmtiga");

	public static void main(String[] args) {
		SpringApplication.run(FcmtigaApplication.class, args);
	}

	@Bean
	public WebClient webClient() {
		return WebClient.create();
	}

}
