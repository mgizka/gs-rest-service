
package com.example.restservice;

public class CpeInfo {

	private final String msisdn;
	private final String content;

	public CpeInfo(String msisdn) {
		this.msisdn = msisdn;
		this.content = "{ \"msisdn\" : " + msiddn + ", \"cpemodel\" : \"samsung\" , \"cpeversion\" : \"1.2.2\" }";
	}

	public String getMsisdn() {
		return msisdn;
	}

	public String getContent() {
		return content;
	}
}