package com.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.DAO.ProductDAO;
import com.pojo.Product;

public class producttestcase {

	@Test
	public void testSave() {
		ProductDAO product=new ProductDAO();
		Product p=new Product(2, "sachin", "patil", 12f);
		p=product.save(p);
		assertNotNull(p);
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
