package com.kg.sbeans;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	// Field injection- HAS-A property
	@Autowired
	private LocalDate ld;
	@Autowired
	private LocalTime lt;
	
	// business method to generate wish message
	public String generateWishMessage(String user) {
		System.out.println("LocalDate | "+ ld);
		System.out.println("LocalTime | "+ lt);
		int hour= lt.getHour();
		if (hour<12)
			return "Good Morning | "+ user;
		else if (hour<16)
			return "Good Afternoon | "+ user;
		else if (hour<20)
			return "Good Evening | "+ user;
		else
			return "Good Night | "+ user;
	}
}