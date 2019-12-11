package com.allianz.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allianz.shopping.pojos.Product;

public interface ProductDaoImpl extends JpaRepository<Product, Integer>
{

}
