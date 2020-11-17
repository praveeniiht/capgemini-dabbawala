package com.dabbawala.model;

public class CatererOrders {

	private int orderId;
	
	private User userId;
	
	private String menu;
	
	private Catering catererId;

	private int amount;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Catering getCatererId() {
		return catererId;
	}

	public void setCatererId(Catering catererId) {
		this.catererId = catererId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
