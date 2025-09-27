package com.kg.main;

import com.kg.ston.Printer;

public class SingletonClassTest {

	public static void main(String[] args) {
		Printer print1 = Printer.getInstance();
		Printer print2 = Printer.getInstance();
		System.out.println(print1.hashCode() + " | " + print2.hashCode());
		System.out.println("print1==print2? | " + (print1 == print2));

		// invoke the b.methods
		print1.print("hello");
		print2.print("hai");

	}

}
