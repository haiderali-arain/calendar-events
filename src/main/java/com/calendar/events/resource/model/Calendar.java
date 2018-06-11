package com.calendar.events.resource.model;

import java.io.Serializable;

/**
 * 
 * @author Haider Ali
 *
 */
public class Calendar implements Serializable {

	private static final long serialVersionUID = -6060233764539175133L;
	private Long calendarId;
	private String name;
	private User user;
	
	public Long getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Long calendarId) {
		this.calendarId = calendarId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
