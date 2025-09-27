package com.kg.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kg.sbeans.Flipkart;
import com.kg.config.AppConfig;

public class StrategyDPTest {

	public static void main(String[] args) {
        //create  IOC container
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//get  target spring bean class object reference
		Flipkart flip=ctx.getBean("fpkt",Flipkart.class);
  
		//invoke b.method
		String msg=flip.shopping(new String[] {"Samsung","Nokia"}, new double[] {25000.0,15000.0});
		
		System.out.println(msg);
		//close the IOC container
		ctx.close();
		
	}

}
