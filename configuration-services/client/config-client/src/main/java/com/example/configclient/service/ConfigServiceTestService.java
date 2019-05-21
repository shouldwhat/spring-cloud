package com.example.configclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class ConfigServiceTestService {

	@Value("${shouldwhat.profile.said.first}")
	private String first;
	
	@Value("${shouldwhat.profile.said.second}")
	private String second;
	
	public String getTestKeyword(String key) {
		
		switch(key) {
			case "first" : return first;
			case "second" : return second;
			default : return "";
		}
	}
}
