package cn.tedu.test.main.entity;

import java.io.Serializable;

public class TestModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8137398762787588338L;
	
	private String name;
	private String age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "TestModel [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	

}
