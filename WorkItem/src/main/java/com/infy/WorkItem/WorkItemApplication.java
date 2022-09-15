package com.infy.WorkItem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkItemApplication.class, args);
	}


@Bean
public ModelMapper mapper() {
	return new ModelMapper();
}
}