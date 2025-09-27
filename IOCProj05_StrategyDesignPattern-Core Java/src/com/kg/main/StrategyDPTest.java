package com.kg.main;

import com.kg.comp.Flipkart;
import com.kg.factory.FlipkartFactoy;

public class StrategyDPTest {

	public static void main(String[] args) {
		//use factory pattern to target class object
		Flipkart flipkart= FlipkartFactoy.getCourierInstance("blueDart");
		
		//invoke business method
		String msg= flipkart.shopping(new String[] {"Shirt", "Pant"}, new double[] {500.0, 700.0});
		System.out.println(msg);
	}

}
