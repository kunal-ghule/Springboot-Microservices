package com.kg.comp;

import java.util.Arrays;

public final class Flipkart {
	
	//HAS-A property
	ICourierService courier;
	
	public void setCourier(ICourierService courier) {
		this.courier= courier;
	}
	
	//business method
	public String shopping(String[] items, double[] prices) {
		double totalBill= 0;
		for(int i=0;i<prices.length; i++) {
			totalBill= totalBill+prices[i];
		}
		return "Total Bill for "+ Arrays.toString(items)+ " | "+ totalBill+ " | "+ courier.deliver();
		
	}

}
