//DependencyInjectionTest.java
package com.kg.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kg.config.AppConfig;
import com.kg.ston.Printer;

public class SpringBeansScopeTest1 {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		/*	Printer  prn1=ctx.getBean("prn1",Printer.class);
			Printer  prn2=ctx.getBean("prn2",Printer.class);
			System.out.println(prn1.hashCode()+"    "+prn2.hashCode());*/

		// close IOC container
		ctx.close();

	}

}
