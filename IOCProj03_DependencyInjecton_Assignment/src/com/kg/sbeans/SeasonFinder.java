package com.kg.sbeans;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private Date dt;
	
	// business method to find season
	public String findSesaon() {
		// get the current month of the date
		@SuppressWarnings("deprecation")
		int month= dt.getMonth();
		if (month<7&&month>2)
			return "Summer Season";
		else if(month<11&&month>6)
			return "Rainy Season";
		else
			return "Winter Season";
	}
}
