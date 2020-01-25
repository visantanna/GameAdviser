package com.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GamesUpdater {
	@Autowired
	private GameSearcher gameSearcher;
	
	public void execute() {
		System.out.println(gameSearcher.getApiName());
	}
}
