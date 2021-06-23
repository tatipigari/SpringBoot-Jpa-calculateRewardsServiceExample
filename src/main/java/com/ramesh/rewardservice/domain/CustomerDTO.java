package com.ramesh.rewardservice.domain;

import java.util.Set;
import java.util.Scanner;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerDTO {
	
	
	@JsonProperty("customerId")
	private Integer id;
	private String name;
	private Long rewards;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRewards() {
		return rewards;
	}
	public void setRewards(Long rewards) {
		this.rewards = rewards;
	}
	public CustomerDTO(Integer id, String name, Long rewards) {
		super();
		this.id = id;
		this.name = name;
		this.rewards = rewards;
	}
	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}
}

