package com.kg.factory;

import com.kg.comp.BlueDart;
import com.kg.comp.DTDC;
import com.kg.comp.Flipkart;
import com.kg.comp.ICourierService;

public class FlipkartFactoy {
	public static Flipkart getCourierInstance(String courierType) {
		//create dependent class object
		ICourierService courier;
		
		if(courierType.equalsIgnoreCase("dtdc"))
			courier= new DTDC();
		else if(courierType.equalsIgnoreCase("bluedart"))
			courier= new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Courier");
		
		//create target class object
		Flipkart fkt= new Flipkart();
		//assign dependent class object to target class object
		fkt.setCourier(courier);
		return fkt;
		
	}

}
