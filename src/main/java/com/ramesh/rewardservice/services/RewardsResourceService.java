package com.ramesh.rewardservice.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh.rewardservice.dao.CustomerRewardsRepository;
import com.ramesh.rewardservice.domain.Customer;

@Service
public class RewardsResourceService {

	@Autowired
	private CustomerRewardsRepository customerRepository;

	public List<Customer> getCustomerAll() {
		return customerRepository.findAll();
	}

	public Customer getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}

}
