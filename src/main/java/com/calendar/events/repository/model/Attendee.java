package com.calendar.events.repository.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author Haider Ali
 *
 */
@Entity
@Table(name="attendee")
public class Attendee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="attendee_id")
	private Long attendeeId;
	@Column(name="attendee_first_name")
	private String firstName;
	@Column(name="attendee_last_name")
	private String lastName;
//	@ManyToMany(mappedBy = "attendees", fetch=FetchType.LAZY)
//	private List<CalendarEvent> events;
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
