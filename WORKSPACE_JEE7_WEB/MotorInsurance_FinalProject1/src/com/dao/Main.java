package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Policy;

public class Main {
public static void main(String[] args) {
	PolicyDAO policyDAO =new PolicyDAOImpl();
	List<Policy> list = new ArrayList<Policy>();
	list = policyDAO.getPolicyByCustomerId(1);
	System.out.println(list);
}
}
