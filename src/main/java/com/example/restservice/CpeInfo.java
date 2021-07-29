
package com.example.restservice;

public class CpeInfo {

	private final String sn;
	private final String cpeversion;
	private final String cpemodel;
	private final String cpestatus;
	private final String cpetype;


	public CpeInfo(String sn, String model, String version, String cpeStatus, String cpeType) {
		this.msisdn = sn;
		this.cpeversion = version;
		this.cpemodel = model;
	}

	public String getSn() {
		return msisdn;
	}

	public String getCpeModel() {
		return cpemodel;
	}

	public String getCpeVersion() {
		return cpeversion;
	}
	public String getCpeType() {
		return cpeType;
	}
	public String getCpeStatus() {
		return cpeversion;
	}

}