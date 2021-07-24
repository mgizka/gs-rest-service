
package com.example.restservice;

public class CpeInfo {

	private final String msisdn;
	private final String cpeversion;
	private final String cpemodel;


	public CpeInfo(String msisdn) {
		this.msisdn = msisdn;
		cpeversion = "1.2.2";
		cpemodel = "Samsung Galaxy 20 Ultra Note";
	}

	public String getMsisdn() {
		return msisdn;
	}

	public String getCpeModel() {
		return cpemodel;
	}

	public String getCpeVersion() {
		return cpeversion;
	}

	public String getCpeInfo(){
		return "\"msisdn\":" + msisdn + "," + "\"cpemodel\":"+cpemodel +","+ "\"cpeversion\":"+cpeversion; 
	}

}