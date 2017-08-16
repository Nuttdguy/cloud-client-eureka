package com.cloud.client.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaOneController {
	
	@Value("${words}")
	private String words;

	@RequestMapping("/")
	public String getWord() {
		String[] wordArray = words.split(",");
		int idx = (int)Math.round(Math.random() * (wordArray.length - 1));
		return wordArray[idx];
	}
	
}
