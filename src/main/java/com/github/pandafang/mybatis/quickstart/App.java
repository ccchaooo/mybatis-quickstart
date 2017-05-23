package com.github.pandafang.mybatis.quickstart;

import org.apache.ibatis.session.SqlSession;

import com.github.pandafang.mybatis.quickstart.mapper.StudentMapper;
import com.github.pandafang.mybatis.quickstart.model.Student;
import com.github.pandafang.mybatis.quickstart.util.DBUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       
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
        	
        	
        } 
        finally {
        	ss.close();
		}
       
    }
}
