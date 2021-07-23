
package com.example.restservice;

public class CpeInfo {

	private final String msisdn;
	private final String content;

	public CpeInfo(String msisdn) {
		this.id = id;
		this.content = "{ \"msisdn\" : " + msiddn + ", \"cpemodel\" : \"samsung\" , \"cpeversion\" : \"1.2.2\" }";
	}

	public String getMsisdn() {
		return msiddn;
	}

	public String getContent() {
		return content;
	}
}