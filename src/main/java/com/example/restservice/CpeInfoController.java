package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpeInfoController {

	@GetMapping("/cpeinfo")
	public CpeInfo cpeinfo(@RequestParam(value = "msisdn") String msisdn) {
		return new CpeInfo(msisdn);
	}
}
