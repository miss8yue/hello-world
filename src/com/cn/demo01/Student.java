package com.cn.demo01;

public class Student extends Person {
	String school;
	public Student(String name, int age,String school) {
		super(name, age);
		this.setSchool(school);
	}


	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}



	@Override
	public void print() {
		System.out.println("姓名"+this.getName()+"年龄"+this.getAge()+"学校"+this.school);
		
	}
	
}
