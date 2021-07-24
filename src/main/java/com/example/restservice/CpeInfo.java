
package com.example.restservice;

public class CpeInfo {

	private final String msisdn;
	private final String cpeversion;
	private final String cpemodel;


	public CpeInfo(String msisdn, String model, String version) {
		this.msisdn = msisdn;
		this.cpeversion = version;
		this.cpemodel = model;
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

}