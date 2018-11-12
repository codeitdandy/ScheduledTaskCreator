package com.allTasks.TasksScheduleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaAuditing
@EnableJpaRepositories
@EntityScan("model")
public class ScheduleTaskServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ScheduleTaskServiceApplication.class, args);
	}
}
