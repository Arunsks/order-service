package com.arunsks.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arunsks.order.entity.OrderEntity;
import com.arunsks.order.repository.OrderRepository;
import com.arunsks.order.request.OrderRequest;

@Service
public class OrderServiceImp implements IOrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public int createOrder(OrderRequest orderRequest) {

		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setName(orderRequest.getName());
		orderEntity.setDesc(orderRequest.getDesc());
		orderEntity.setPrice(orderRequest.getPrice());
		orderEntity.setQty(orderRequest.getQty());

		OrderEntity res = orderRepository.save(orderEntity);

		int orderId = res.getId();

		return orderId;
	}

}
