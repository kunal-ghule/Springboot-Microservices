package com.kg.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	@Qualifier("blueDart")
	private  ICourier  courier;  //HAS-A property
	
	public Flipkart() {
		System.out.println("Flipkart | 0-param construtor");	
		}
	
	// business method
	public  String  shopping(String items[], double  prices[]) {
		System.out.println("Flipkart | shopping()");
		
		//calculate the bill amount
		double billAmt=0.0;
		for(double p:prices)
			billAmt=billAmt+p;
		
		//generate the order id
		int oid=new Random().nextInt(1000);
		
		//deliver items
		String msg=courier.deliver(oid);
		
		//send final message
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" bill amount- "+billAmt+" | "+msg;
	}
}
