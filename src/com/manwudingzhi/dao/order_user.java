package com.manwudingzhi.mapping.shopping;

import java.util.List;

import com.manwudingzhi.domain.shopping.OrderDetail;
import com.manwudingzhi.domain.shopping.Orders;

public interface order_user {
	
	//查询订单，关联查询用户信息，使用resultMap实现 
	public List<Orders> selectorder(Orders orders);
	
	// 查询订单(关联用户)及订单明细 
	public List<Orders> selectorderAndInfo(Orders orders);
	
	// 查询用户及用户购买的商品信息，使用resulaMap 
	public List<Orders>  findUserAndItemsResultMap();
	
	//插入订单
	public int insertOneOrder(Orders orders);
	
	//插入订单明细
	public int insertOneOrderDetail(OrderDetail  detail);
	

	
	
}
