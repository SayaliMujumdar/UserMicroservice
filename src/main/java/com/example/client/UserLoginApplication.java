package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
@EnableEncryptableProperties
@SpringBootApplication(scanBasePackages="com.example", exclude = { SecurityAutoConfiguration.class })

public class UserLoginApplication {
      
	public static void main(String[] args) {
		SpringApplication.run(UserLoginApplication.class, args);
	}
	

}
