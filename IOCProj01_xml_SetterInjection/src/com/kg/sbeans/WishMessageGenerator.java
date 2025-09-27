package com.kg.sbeans;
import java.time.LocalTime;

public class WishMessageGenerator {
	LocalTime lt; // Has-A property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator | 0-param constructor");
	}
	
	public WishMessageGenerator(LocalTime lt) {
		this.lt=lt;
		System.out.println("WishMessageGenerator | 1-param constructor");
	}
 
	//Setter method for setter injection
	public void setLt(LocalTime lt) {
		this.lt = lt;
		System.out.println("WishMessageGenerator | setLt()");
	}
	
	// Business method to generate wish message
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator | generateWishMessage()");
		//get current hour of the day
		int hour= lt.getHour();
		if (hour<12)
			return "Good Morning |"+ user;
		else if (hour<16)
			return "Good Afternoon | "+ user;
		else if (hour<20)
			return "Good Evening | "+user;
		else
			return "Good Nignt | "+ user;
	}
}