package com.menglang.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@RefreshScope
@SpringBootApplication
public class DoctorApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

}
