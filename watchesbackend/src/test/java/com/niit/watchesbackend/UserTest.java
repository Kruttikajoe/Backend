package com.niit.watchesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchesbackend.DAO.UserDAO;
import com.niit.watchesbackend.model.User;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		context.getBean("user");
		
		UserDAO userDAO= (UserDAO)context.getBean("userDAO");
		User user=(User)context.getBean("user");
		user.setUsername("user2");
		user.setPassword("efgh");
		user.setEmailid("ab.yahoo.com");
		user.setAddress("Mumbai");
		user.setPhno("987654321");
		user.setEnabled("true");
		user.setRole("User");
		//userDAO.saveorUpdate(user);
		userDAO.delete(user);
		//System.out.println("user created");
		System.out.println("user deleted");
	}
}
