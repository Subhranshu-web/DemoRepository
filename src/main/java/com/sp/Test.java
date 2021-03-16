package com.sp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("test")
public class Test {

	@Autowired
	@Qualifier("sp")
	public Jyoti jyoti;
	
	
	public String showRooms(){
		String room = jyoti.room();
		return room;
		
		
	}
	
	
}
