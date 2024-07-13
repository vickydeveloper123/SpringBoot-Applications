package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderDetails;

public interface OrderIdRepoGenerator extends JpaRepository<OrderDetails, String>{

}
