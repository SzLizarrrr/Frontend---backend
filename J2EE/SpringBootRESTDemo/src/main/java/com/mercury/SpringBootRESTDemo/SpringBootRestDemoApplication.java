package com.mercury.SpringBootRESTDemo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mercury.SpringBootRESTDemo.aop.DummyDao;
import com.mercury.SpringBootRESTDemo.aop.IDynamicDao;
import com.mercury.SpringBootRESTDemo.controller.OrderController;
import com.mercury.SpringBootRESTDemo.dao.ProductDao;

@SpringBootApplication
public class SpringBootRestDemoApplication implements CommandLineRunner {
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	DummyDao dummyDao;
	
	@Autowired
	OrderController orderController;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(Arrays.asList(productDao.findAll()));
		
		IDynamicDao dynamicDao = (IDynamicDao)dummyDao;
		dynamicDao.sayHello();
		
		System.out.println(Arrays.asList(productDao.findByBrand("Staples")));
		System.out.println(productDao.getMaxPrice());
		System.out.println(productDao.getProducstWithStock(100));
		
		orderController.printOrders();
	}
}
