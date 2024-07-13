package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderDetails;
import com.example.demo.repository.OrderIdRepoGenerator;
@Service
public class orderservice {
	
	private OrderIdRepoGenerator repositoryGenerator;

	public OrderIdRepoGenerator getRepositoryGenerator() {
		return repositoryGenerator;
	}

	@Autowired
	public void setRepositoryGenerator(OrderIdRepoGenerator repositoryGenerator) {
		this.repositoryGenerator = repositoryGenerator;
	}
	
	
	public void saveOrder() {
		OrderDetails detailer=new OrderDetails();
		detailer.setOrderBy("Raja");

		repositoryGenerator.save(detailer);
	}
	
	public void getAllOrders() {
		List<OrderDetails> all = repositoryGenerator.findAll();
		
		System.out.println(all);
		
	}
	
	
	public void orderUpdate() {
		Optional<OrderDetails> byId = repositoryGenerator.findById("OD2");
		

		if(byId.isPresent()) {
			OrderDetails details1=byId.get();
			details1.setOrderBy("Amma");
			
			OrderDetails save = repositoryGenerator.save(details1);
			System.out.println(" Order Details has been saved sucessfullu :"+ save);
			
			
		}
	}
	

}
