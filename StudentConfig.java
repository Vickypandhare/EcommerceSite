package com.vicky4.Spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
		@Bean
		public Course courseBean() {
			return new Course();
		}
		@Bean
		public Student studentBean() {
			return new Student(courseBean());
		}
}
