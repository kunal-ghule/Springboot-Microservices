package com.kg.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pDetails")
public class PersonDetails {

	// injecting the values from the properties file
	@Value("${per.id}")
	private int pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.addrs}")
	private String paddr;
	@Value("${per.age}")
	private Integer page;

	// hard coding of the values
	@Value("kunal@gmail.com")
	private String email;
	
	// injecting the system property values
	@Value("${os.name}")
	private String osName;
	@Value("${os.version}")
	private String osVersion;
	
	// injecting environment variable values
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "PersonDetails\n"
				+ "pid=" + pid + ", pname=" + pname + ", paddrs=" + paddr + ", page=" + page + "\n "
				+ "Email=" + email + "\n"
				+ "osName=" + osName + ", osVersion=" + osVersion + "\n"
				+ "pathData=" + pathData;
	}

}
