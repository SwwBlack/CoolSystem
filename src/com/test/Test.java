package com.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.ServeiceImpl.StudentServiceImpl;
import com.ssh.model.daoImpl.StudentDaoImpl;

public class Test {
   
    @org.junit.Test
    public void create() throws SQLException{
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	DataSource dataSource = context.getBean(DataSource.class);
    	System.out.println(dataSource.getConnection());
    }
    /*
    @org.junit.Test
    public void Tests(){
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	SessionFactory sessionFactory = context.getBean(SessionFactory.class);
    	Session session = sessionFactory.getCurrentSession();
    	System.out.println(session);
    }*/
    //studentDaoImpl∑Ω∑®≤‚ ‘
	
    @org.junit.Test
    public void TestDelStudent(){
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl serviceImpl = context.getBean(StudentServiceImpl.class);
    	//System.out.println(serviceImpl.registerSuccess());
    }
}
