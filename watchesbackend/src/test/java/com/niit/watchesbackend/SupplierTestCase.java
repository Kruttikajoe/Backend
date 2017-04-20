package com.niit.watchesbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchesbackend.DAO.SupplierDAO;
import com.niit.watchesbackend.model.Supplier;



public class SupplierTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static SupplierDAO supplierDAO; 
	
	@Autowired
	static Supplier supplier;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		supplier=(Supplier)context.getBean("supplier");
	}

	@Test
	public void test() {
		supplier.setSupname("Fossil");
		supplier.setSupaddress("Hyderabad");
		boolean b=supplierDAO.saveorUpdate(supplier);
		assertEquals("saved",true,b);

	}

}
