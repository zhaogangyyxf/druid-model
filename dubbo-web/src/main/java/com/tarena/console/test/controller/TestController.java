package com.tarena.console.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.dubbo.service.DubboTestService;
import com.jt.dubbo.service.DubboTestService2;

@Controller
public class TestController {
	
	@Autowired
	private DubboTestService dubboTestService;
	@Autowired
	private DubboTestService2 dubboTestService2;
	
	@RequestMapping("hello")
	@ResponseBody
	public String testHello(){
		return dubboTestService.testModel();
	}
	@RequestMapping("hello2")
	@ResponseBody
	public String testHello2(){
		return dubboTestService2.testModel();
	}

}
