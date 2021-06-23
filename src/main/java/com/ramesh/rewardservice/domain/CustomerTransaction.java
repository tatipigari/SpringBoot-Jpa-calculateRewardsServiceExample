package com.ramesh.rewardservice.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CustomerTransaction extends Reward {
	@Id
	@GeneratedValue
	private Long id;
	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private Customer customer;
	private Double purchaseAmount;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	public CustomerTransaction() {
		super();
	}

	public CustomerTransaction(Long id, Customer customer, Double total, Date date) {
		super();
		this.id = id;
		this.customer = customer;
		this.purchaseAmount = total;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Double getTotal() {
		return purchaseAmount;
	}

	public Double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(Double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public void setTotal(Double total) {
		this.purchaseAmount = total;
	}

	@Override
	public Long getPoints() {
		this.points = 0l;

		if (this.purchaseAmount > 50 && this.purchaseAmount <= 100) {
			this.points += (this.purchaseAmount.intValue() - 50) * 1;

		}

		if (this.purchaseAmount > 100) {
			this.points += 50;
			this.points += (this.purchaseAmount.intValue() - 100) * 2;
		}

		return this.points;
	}

}
