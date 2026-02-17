package com.arunsks.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arunsks.OrderServiceApplication;
import com.arunsks.order.request.OrderRequest;
import com.arunsks.order.service.OrderServiceImp;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderServiceImp orderServiceImp;

	@PostMapping("/create")
	public ResponseEntity createOrder(@RequestBody OrderRequest orderRequest) {

		int id = orderServiceImp.createOrder(orderRequest);

		System.out.println("orderId is : " + id);

		return ResponseEntity.ok(200);
	}

}
