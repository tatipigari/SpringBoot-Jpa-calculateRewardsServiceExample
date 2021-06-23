package com.ramesh.rewardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class RewardCalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardCalServiceApplication.class, args);
	}

}
