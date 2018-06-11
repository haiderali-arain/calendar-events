package com.calendar.events.resource.model;

import java.io.Serializable;

/**
 * 
 * @author Haider Ali
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 4260316493835943982L;
	private Long userId;
	private String userName;
	private String firstName;
	private String lastName;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
