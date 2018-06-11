package com.calendar.events.resource.model;

import java.io.Serializable;

/**
 * 
 * @author Haider Ali
 *
 */
public class Attendee implements Serializable{

	private static final long serialVersionUID = 3378430524229879444L;
	private Long attendeeId;
	private String firstName;
	private String lastName;
	
	public Long getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(Long attendeeId) {
		this.attendeeId = attendeeId;
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
