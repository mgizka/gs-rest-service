
package com.example.restservice;

public class CpeInfo {

	private final String sn;
	private final String cpeversion;
	private final String cpemodel;
	private final String cpestatus;
	private final String cpetype;


	public CpeInfo(String sn, String model, String version, String status, String type) {
		this.sn = sn;
		this.cpeversion = version;
		this.cpemodel = model;
		this.cpestatus = status;
		this.cpetype = type;
		
	}

	public String getSn() {
		return sn;
	}

	public String getCpeModel() {
		return cpemodel;
	}

	public String getCpeVersion() {
		return cpeversion;
	}
	public String getCpeType() {
		return cpetype;
	}
	public String getCpeStatus() {
		return cpestatus;
	}

}