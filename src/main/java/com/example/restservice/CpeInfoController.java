package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpeInfoController {

	

	@GetMapping("/cpeinfo/{msisdn}")
	public CpeInfo cpeinfo(@PathVariable String msisdn) {
		return new CpeInfo(msisdn);
	}
}
