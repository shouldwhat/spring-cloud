package com.example.configclient.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.configclient.service.ConfigServiceTestService;

@RestController
public class ConfigServerTestController {

	@Autowired
	private ConfigServiceTestService configServiceTestService;
	
	@GetMapping(value = "/keyword")
	public Map<String, Object> getTestKeyword(HttpServletRequest request, 
			@RequestParam String keyword) {
		
		Map<String, Object> result = new HashMap<>();
		result.put("keyword", keyword);
		result.put("value", configServiceTestService.getTestKeyword(keyword));
		
		return result;
	}
}
