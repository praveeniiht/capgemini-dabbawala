package com.dabbawala.model;

public class User {

	/** username-Holds the username of the user password-holds the password of the user. */
	private String userId;
	
	/** The password. */
	private String password;
	
	/** The role. */
	private String role;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
