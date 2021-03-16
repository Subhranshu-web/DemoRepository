package com.sp;

import org.springframework.stereotype.Component;

@Component("sp")
public class Bulu implements Jyoti {

	@Override
	public String room() {
		
		return "Executing Bulu.....";
	}
	

}
