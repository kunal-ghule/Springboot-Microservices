package com.kg.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kg.config.AppConfig;
import com.kg.sbeans.A;

public class CyclicDITest {

	public static void main(String[] args) {
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		// get spring bean class obj ref
		A a = ctx.getBean("a1", A.class);
		System.out.println(a);

		ctx.close();

	}

}
