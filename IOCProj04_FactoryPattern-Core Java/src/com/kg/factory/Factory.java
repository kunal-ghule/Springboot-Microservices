package com.kg.factory;
import com.kg.comp.ICar;
import com.kg.comp.LuxuryCar;
import com.kg.comp.SUVCar;
import com.kg.comp.StandardCar;

public class Factory {
	// static factory method to create car object
	public static ICar makeCar(String type) {
		ICar car = null;
		if (type.equalsIgnoreCase("Standard"))
			car= new StandardCar();
		else if (type.equalsIgnoreCase("luxury"))
			car= new LuxuryCar();
		else if (type.equalsIgnoreCase("suv"))
			car=  new SUVCar();
		else
			System.out.println("Enter corrrect name");
		
		return car;
	}
}
