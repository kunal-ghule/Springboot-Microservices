package com.kg.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier  {
	
	public DTDC() {
		System.out.println("DTDC | 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC | deliver()");
		return "Order id- "+ oid+ " |Items ready to deliver using DTDC Courier Service";
	}

}
