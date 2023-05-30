package com.vaishnavi.movieschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class MovieScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieScheduleApplication.class, args);
	}

}
