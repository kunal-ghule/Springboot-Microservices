// Field Injection using @Autowired with XML configuration

package com.kg.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.kg.sbeans.WishMessageGenerator;

public class DependencyInjecationTest {
	public static void main(String[] args) {
		// creating IOC container
		ClassPathXmlApplicationContext ctx= 
				new ClassPathXmlApplicationContext("com/kg/config/ApplicationContext.xml");
		WishMessageGenerator generator= (WishMessageGenerator)ctx.getBean("wmg");
		System.out.println(generator.generateWishMessage("Kunal"));
		ctx.close();		// closing the container
	}
}