// Assignment 
// Field Dependency Injection through Annotation

package com.kg.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kg.config.AppConfig;
import com.kg.sbeans.SeasonFinder;

public class DependencyInjection {
	public static void main(String[] args) {
		// creating the IOC Container
		AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext(AppConfig.class);
		SeasonFinder finder= ctx.getBean("sf",SeasonFinder.class);
		// call the business method
		System.out.println(finder.findSesaon());
		ctx.close();		// close the container
	}

}
