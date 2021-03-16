package com.sp;

import org.springframework.stereotype.Component;

@Component("satya")
public class Satya implements Jyoti{

	@Override
	public String room() {
		
		return "Executing Satya";
	}

	
}
