package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpeController {

	@GetMapping("/cpe")
	public Cpe cpe(@RequestParam(value = "msisdn") String msisdn) {
		return new Cpe(msisdn);
	}
}
