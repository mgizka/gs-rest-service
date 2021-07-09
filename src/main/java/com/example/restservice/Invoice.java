package com.example.restservice;

public class Invoice {

	private final String id;
	private final String content;

	public Invoice(String id, String content) {
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}