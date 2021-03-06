package com.github.pandafang.mybatis.quickstart.model;

public class Student {

	private Integer id;
	private Integer age;
	private String name;
	
	public Student() {
		super();
	}
	
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
