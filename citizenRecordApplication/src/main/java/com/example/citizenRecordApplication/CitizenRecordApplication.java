package com.example.citizenRecordApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class CitizenRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenRecordApplication.class, args);
	}

}
