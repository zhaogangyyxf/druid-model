package com.jt.dubbo.service;

import org.springframework.stereotype.Service;

@Service
public class DubboTestServiceImpl2 implements DubboTestService2 {

	@Override
	public String testModel() {
		System.out.println("test2");
		return "Hello word2";
	}

}
