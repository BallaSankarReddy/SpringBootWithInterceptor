package com.springboot.interceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class IntercepterConfig implements WebMvcConfigurer {
	
	@Autowired
	private  RequestHeaderIntercepter requestHeaderIntercepter;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestHeaderIntercepter);
		//WebMvcConfigurer.super.addInterceptors(registry);
	}
	
	

}
