package com.springboot.interceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OriganizationController {

	@GetMapping("/")
	public String interceptorTest()
	{
		return "Interceptor Success...";
	}
}
