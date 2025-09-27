package com.kg.config;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.kg.sbeans")
public class AppConfig {
	
	@Bean(name="ldate")
	public LocalDate createLDate() {
		System.out.println("AppConfig | createLDate()");
		return LocalDate.now();
	}
	
	@Bean(name="ltime")
	public LocalTime createLTime() {
		System.out.println("AppConfig | createLTime()");
		return LocalTime.now();
	}
	
}
