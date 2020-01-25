package com.tutorial.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChickenCoopApi implements GameSearcher{
	private static final String apiName = "ChickenCoopApi";
	@Override
	public String getApiName() {
		return apiName;
	}
}
