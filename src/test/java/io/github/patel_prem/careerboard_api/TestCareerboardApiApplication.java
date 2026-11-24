package io.github.patel_prem.careerboard_api;

import org.springframework.boot.SpringApplication;

public class TestCareerboardApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(CareerboardApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
