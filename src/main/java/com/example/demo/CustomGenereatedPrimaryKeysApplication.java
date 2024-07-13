package com.example.demo;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.OrderDetails;
import com.example.demo.repository.OrderIdRepoGenerator;
import com.example.demo.service.orderservice;

@SpringBootApplication
public class CustomGenereatedPrimaryKeysApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CustomGenereatedPrimaryKeysApplication.class, args);

		System.out.println(" Connection established sucessfully to the database....");
		
		
		
		orderservice bean = run.getBean(orderservice.class);
		
		bean.saveOrder();

		/*
		 * OrderIdRepoGenerator bean = run.getBean(OrderIdRepoGenerator.class);
		 * 
		 * OrderDetails details = new OrderDetails();
		 * 
		 * 
		 * details.setOrderBy("Ice Cream");
		 * 
		 * OrderDetails save = bean.save(details); System.out.println(save);
		 * run.close();
		 */
		
		
		/*
		 * details.setOrderId("Dora");
		 * 
		 * details.setOrderPlaceDate(null)
		 * 
		 * 
		 * OrderDetails save = bean.save(details);
		 * 
		 * System.out.println(save); run.close();
		 */

	}

}
