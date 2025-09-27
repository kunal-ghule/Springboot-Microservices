package com.kg.main;
import java.util.Scanner;
import com.kg.comp.ICar;
import com.kg.factory.Factory;

public class TestCar {
	public static void main(String[] args) {
		System.out.println("---|Welcome to Car Factory|---");
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter car name to drive");
			System.out.println("\t 1. Standard\n\t 2. SUV\n\t 3. Luxury");
			String carName=scn.nextLine();
			ICar car= Factory.makeCar(carName);
			car.drive();
		}
	}

}
