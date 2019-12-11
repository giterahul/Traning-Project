package com.dao;

import java.util.List;

import com.model.Policy;

public interface PolicyDAO {
public Policy getPolicyByPolicyNo(int policyNo);
public List<Policy> getPolicyByCustomerId(int customerId);
}
