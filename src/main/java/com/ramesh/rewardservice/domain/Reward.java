package com.ramesh.rewardservice.domain;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class Reward {

	@JsonInclude  
  	@Transient    
	protected Long points;
	public abstract Long getPoints();

}



