package cn.tedu.test.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.test.main.dao.TestDao;
import cn.tedu.test.main.entity.TestModel;
@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao dao;
	
	public List<TestModel> findList() {
		// TODO Auto-generated method stub
		return dao.findList();
	}

}
