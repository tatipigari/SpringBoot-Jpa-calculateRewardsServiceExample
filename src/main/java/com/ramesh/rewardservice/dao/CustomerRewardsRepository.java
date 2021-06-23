package com.ramesh.rewardservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ramesh.rewardservice.domain.Customer;


@Repository
public interface CustomerRewardsRepository extends JpaRepository<Customer, Integer>{
    
	@Query(value = "SELECT * FROM customer c ,CUSTOMER_TRANSACTION cts where c.id=cts.customer_id and cts.date>sysdate-90",nativeQuery = true)
	List<Customer> getAllCustomers();

}


