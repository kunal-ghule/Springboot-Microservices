package com.kg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({ "com/kg/commons/Info1.properties", "com/kg/commons/Info.properties" })
@ComponentScan(basePackages = "com.kg")
public class AppConfig {

}
