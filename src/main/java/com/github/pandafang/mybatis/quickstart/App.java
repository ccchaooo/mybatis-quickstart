package com.github.pandafang.mybatis.quickstart;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.github.pandafang.mybatis.quickstart.mapper.StudentMapper;
import com.github.pandafang.mybatis.quickstart.model.Student;
import com.github.pandafang.mybatis.quickstart.util.DBUtil;

public class App 
{
    public static void main( String[] args )
    {
        SqlSession ss = DBUtil.openSqlSession();
        try {
        	
        	Student student = new Student("李四", 22);
        	StudentMapper studentMapper = ss.getMapper(StudentMapper.class);
        	int result = studentMapper.add(student);
        	ss.commit();
        	if (result > 0) {
        		System.out.println("增加成功, result:" + result);
        	}
        	else {
        		System.out.println("增加失败");
        	}
        	
        	Student student2 = new Student("王五", 23);
        	student2.setId(2);
        	studentMapper.update(student2);
        	ss.commit();
        	
        	Student student3 = studentMapper.findById(2);
        	if (student3 != null) {
        		System.out.println("查到 student id=" + student3.getId() + " name=" + student3.getName() + " age=" + student3.getAge());
        	}
        	else {
        		System.out.println("没有查到id 为2的 student");
        	}
        	
        	System.out.println("------ 查询所有的Student -------");
        	List<Student> students = studentMapper.findAll();
        	
        	for (Student stu : students) {
        		System.out.println("查到 student id=" + stu.getId() + " name=" + stu.getName() + " age=" + stu.getAge());
        	}
        	
        	studentMapper.delete(student3);
        	ss.commit();
        	
        } 
        finally {
        	ss.close();
		}
       
    }
}
