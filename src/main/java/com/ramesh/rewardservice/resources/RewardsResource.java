package com.ramesh.rewardservice.resources;

import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh.rewardservice.domain.Customer;
import com.ramesh.rewardservice.domain.CustomerDTO;
import com.ramesh.rewardservice.services.RewardsResourceService;

import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
public class RewardsResource {

	@Autowired
	private RewardsResourceService rewardsService;
	
	@GetMapping("/getAll3MCustomerRewards")
	public List<Customer> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	
	
}




