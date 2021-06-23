package com.ramesh.rewardservice.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RewardsCalShhedular {

	@Scheduled(fixedRate=6000)
	public void loadCustmerPurchaseData(){
		System.out.println("*****  Here we can implement the data loading logic to database *******");
	}
}
