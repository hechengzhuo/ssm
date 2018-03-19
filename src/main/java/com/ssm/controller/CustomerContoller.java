package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.service.CustomerService;

@Controller
public class CustomerContoller {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String list(ModelMap map){
		map.addAttribute("list",customerService.list());
		return "index";
	}
}
