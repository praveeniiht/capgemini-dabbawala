package com.dabbawala.model;

import java.sql.Date;

public class DabbaOrders {

	private int orderId;
	
	private Dabbawala dabbawalaId;
	
	private User userId;
	
	private int duration;
	
	private Date startDate;
	
	private Date endDate;
	
	private long amount;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Dabbawala getDabbawalaId() {
		return dabbawalaId;
	}

	public void setDabbawalaId(Dabbawala dabbawalaId) {
		this.dabbawalaId = dabbawalaId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	
	
}
