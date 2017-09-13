package com.saral.training.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
	
	PreNumber PreNumber = new PreNumber();

	@WebMethod
	public int getNumber(){
		return PreNumber.a;
	}
}
