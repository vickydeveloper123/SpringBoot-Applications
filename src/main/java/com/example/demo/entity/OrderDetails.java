package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "Order_Details")
@Data

public class OrderDetails {

	@Id
	@Column(name = "Order_Id")

	@GenericGenerator(name = "order_id_gen", strategy = "com.example.demo.generators.OrderedIdGenerators")
	@GeneratedValue(generator = "order_id_gen")
	private String orderId;

	@Column(name = "Order_By")
	private String orderBy;

	
	/*
	 * @Column(name = "Order_PlacedDate")
	 * 
	 * @Temporal(TemporalType.DATE) private Date orderPlacedData;
	 */
	
	
	@CreationTimestamp
	@Column(name = "order_created_Time", updatable = false)
	LocalDateTime orderPlaceDate;

	@UpdateTimestamp
	@Column(name = "order_update_Time", insertable = false)
	LocalDateTime orderUpdateDate;


}
