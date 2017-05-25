package com.github.pandafang.mybatis.quickstart.mapper;

import java.util.List;

import com.github.pandafang.mybatis.quickstart.model.Student;

public interface StudentMapper {
	
	public int add(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student findById(Integer id);
	
	public List<Student> findAll();

}
