package com.kg.sbeans;

import org.springframework.stereotype.Component;

@Component("blueDart")
//@Primary
//@Lazy(true)
public final class BlueDart implements ICourier {
	
	public BlueDart() {
		System.out.println("BlueDart | 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart | deliver()");
		return "Order id- "+ oid+ " |Items ready to deliver using BlueDart Courier Service";
	}

}
