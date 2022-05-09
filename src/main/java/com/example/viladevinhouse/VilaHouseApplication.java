package com.example.viladevinhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class VilaHouseApplication {

	public static void main(String[] args) {
		//System.out.println(new BCryptPasswordEncoder().encode("carlos"));
		SpringApplication.run(VilaHouseApplication.class, args);
	}
}

//$2a$10$0OWJr6/3ympFT/4JgsAKL.5Kyqw/Q6rFpuoV/iQSgcNUQFt1ONzLS