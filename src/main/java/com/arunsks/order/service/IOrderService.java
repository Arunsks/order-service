package com.arunsks.order.service;

import com.arunsks.order.request.OrderRequest;

public interface IOrderService {
	public int createOrder(OrderRequest OrderRequest);
}
