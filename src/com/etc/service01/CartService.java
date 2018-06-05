package com.etc.service01;

import java.util.List;

import com.etc.entity.Cart;

public interface CartService {
	public List<Cart> getCarts();
	public boolean delCart(int CARTID);
}
