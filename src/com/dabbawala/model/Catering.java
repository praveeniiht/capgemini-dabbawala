package com.dabbawala.model;

import java.util.List;

public class Catering {

	private int catererId;
	
	private String catererName;
	
	private String location;

	private List<String> menu;
	
	public int getCatererId() {
		return catererId;
	}

	public void setCatererId(int catererId) {
		this.catererId = catererId;
	}

	public String getCatererName() {
		return catererName;
	}

	public void setCatererName(String catererName) {
		this.catererName = catererName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}

}
