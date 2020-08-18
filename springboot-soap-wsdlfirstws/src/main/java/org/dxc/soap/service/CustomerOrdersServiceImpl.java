package org.dxc.soap.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.apache.cxf.feature.Features;

import myshopping.org.dxc.customerorders.CreateOrdersRequest;
import myshopping.org.dxc.customerorders.CreateOrdersResponse;
import myshopping.org.dxc.customerorders.CustomerOrdersPortType;
import myshopping.org.dxc.customerorders.GetOrdersRequest;
import myshopping.org.dxc.customerorders.GetOrdersResponse;
import myshopping.org.dxc.customerorders.Order;
import myshopping.org.dxc.customerorders.Product;

@Features(features="org.apache.cxf.feature.LoggingFeature")
@WebService(endpointInterface ="myshopping.org.dxc.customerorders.CustomerOrdersPortType")
public class CustomerOrdersServiceImpl implements CustomerOrdersPortType{
	
	int currentId;
	Map<BigInteger,List<Order>> customerOrders=new HashMap<>();
	
	public CustomerOrdersServiceImpl(){
		init();
	}
	public void init() {
		List<Order> orders=new ArrayList<>();
		Order order=new Order();
		order.setId(BigInteger.valueOf(1));
		Product product=new Product();
		product.setId("1");
		product.setQuantity(BigInteger.valueOf(5));
		product.setDescription("Mac Pro");
		order.getProduct().add(product); // 1 --->Mac Pro (5)
		orders.add(order);
		customerOrders.put(BigInteger.valueOf(++currentId),orders);
	}

	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest parameters) {
		
		BigInteger customerId=parameters.getCustomerId();
		List<Order> orders=customerOrders.get(customerId);
		GetOrdersResponse response=new GetOrdersResponse();
		response.getOrder().addAll(orders);
		
		return response;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest parameters) {
		BigInteger customerId=parameters.getCustomerId();
		Order order=parameters.getOrder();
		
		List<Order> orders=customerOrders.get(customerId);
		orders.add(order);
		
		CreateOrdersResponse response=new CreateOrdersResponse();
		response.setResult(true);
		
		return response;
	}

}
