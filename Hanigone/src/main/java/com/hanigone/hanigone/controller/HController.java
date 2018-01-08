package com.hanigone.hanigone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hanigone.hanigone.service.HService;


@Controller
public class HController {

	@Autowired
	private HService hService;
	
	
}
