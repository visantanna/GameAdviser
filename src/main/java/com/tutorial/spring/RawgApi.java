package com.tutorial.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class RawgApi implements GameSearcher{
	private static final String apiName = "RawgApi";
	@Override
	public String getApiName() {
		return apiName;
	}
	
}
