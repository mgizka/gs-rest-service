
package com.example.restservice;

import com.google.gson.Gson;

public class CpeInfo {

	private final String msisdn;
	private final String cpeversion;
	private final String cpemodel;


	public CpeInfo(String msisdn) {
		this.msisdn = msisdn;
		cpeversion = "1.2.3";
		cpemodel = "Samsung Galaxy 20 Ultra Note";
	}

	public String getcpeInfo(){
		return new Gson().toJson(this);
	}
}