package ru.netology.DockerFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ru.netology.DockerFile.service")
public class AuthorizationApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationApplication.class, args);
	}
}

