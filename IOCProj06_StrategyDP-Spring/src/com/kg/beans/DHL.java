package com.kg.beans;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements ICourier  {
	
	public DHL() {
		System.out.println("DHL | 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL | deliver()");
		return "Order id- "+ oid+ " |Items ready to deliver using DHL Courier Service";
	}

}
