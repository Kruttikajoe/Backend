package com.niit.watchesbackend;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchesbackend.DAO.UserDAO;
import com.niit.watchesbackend.model.User;

public class UserTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static UserDAO userDAO; 
	
	@Autowired
	static User user;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
		user=(User)context.getBean("user");
	}
	@Test
	public void test() {
		user.setUsername("payal");
		user.setAddress("Hyd");
		user.setEmailid("hyd@gmail.com");
		user.setPassword("password");
		user.setPhno("249941962");
		user.setRole("user");
		user.setRole("enabled");
		boolean b=userDAO.saveorUpdate(user);
		assertEquals("saved",true,b);
		
		
	}

}
