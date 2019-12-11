package com.allianz.shopping.dao;

import java.util.List;

import com.allianz.shopping.model.AddToCart;
import com.allianz.shopping.model.Order;

public interface AddToCartDAO 
{
	public boolean addToCart(AddToCart add);

	List<AddToCart> getAddToCartByOrderId(int order_id);
}
