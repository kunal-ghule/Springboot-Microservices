package com.kg.config;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.kg.sbeans")
public class AppConfig {
	@Bean(name="date")
	public Date setDate() {
		return new Date();
	}

}
