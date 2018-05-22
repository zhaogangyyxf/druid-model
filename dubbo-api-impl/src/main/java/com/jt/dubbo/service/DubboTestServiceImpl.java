package com.jt.dubbo.service;

import org.springframework.stereotype.Service;

@Service
public class DubboTestServiceImpl implements DubboTestService {

	@Override
	public String testModel() {
		System.out.println("test");
		return "Hello word";
	}

}
