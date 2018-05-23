package cn.tedu.test.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.test.main.entity.TestModel;
import cn.tedu.test.main.service.TestService;

@Controller
public class TestController {
	
	
	
	@Autowired
	private TestService testService;
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	@RequestMapping("findList")
	@ResponseBody
	public List<TestModel> findList() {
		//这是测试代码，捕捉异常不在进行，一切从简，嘿嘿
		return testService.findList();
		
	}
	
}

