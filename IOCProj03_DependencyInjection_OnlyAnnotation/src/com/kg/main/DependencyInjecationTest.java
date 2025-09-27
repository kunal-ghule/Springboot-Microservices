// Field Injection through Annotation driven configuration only

package com.kg.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kg.config.AppConfig;
import com.kg.sbeans.WishMessageGenerator;

public class DependencyInjecationTest {
	public static void main(String[] args) {
		// creating IOC container
		AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator= (WishMessageGenerator)ctx.getBean("wmg");
		String result= generator.generateWishMessage("Kunal");
		System.out.println(result);
		ctx.close();		// closing the container
	}
}