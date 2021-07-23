
package com.example.restservice;

public class CpeInfo {

	private final String msisdn;
	private final String cpemodel;
    private final String cpeversion;
    

	public CpeInfo(String msisdn) {
		this.msisdn = msisdn;
		this.cpemodel = "Samsung";
        this.cpeversion = "1.2.2";
	}

	public String getMsisdn() {
		return msisdn;
	}

	public String getCpemodel() {
		return cpemodel;
	}
    public String getCpeversion() {
		return cpeversion;
	}
}