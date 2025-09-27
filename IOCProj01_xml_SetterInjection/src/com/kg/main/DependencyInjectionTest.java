// Setter Injection using xml driven configuration

package com.kg.main;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.kg.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest |main()-start");
		//creating IOC container
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/kg/config/ApplicationContext.xml");
		//get bean id of Target Spring bean class object
		WishMessageGenerator generator=(WishMessageGenerator)ctx.getBean("wmg");
		//calling the business method from Target class
		String msg= generator.generateWishMessage("Kunal");
		System.out.println(msg);
		//closing the connection
		ctx.close();
		System.out.println("DependencyInjectionTest | main()-end");
	}
}
