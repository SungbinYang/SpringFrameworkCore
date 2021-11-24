package me.sungbin.demospring53;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Demospring53Application {

	public static void main(String[] args) {
		SpringApplication.run(Demospring53Application.class, args);
	}

}
