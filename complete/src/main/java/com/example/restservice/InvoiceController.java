package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

	@GetMapping("/invoice")
	public Invoice invoice(@RequestParam(value = "number", defaultValue = "INV-00001") String id) {
		return new Invoice(id, "test: "+id);
	}
}
