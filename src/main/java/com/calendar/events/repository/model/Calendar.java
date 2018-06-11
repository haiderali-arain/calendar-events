package com.calendar.events.repository.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Haider Ali
 *
 */
@Entity
@Table(name="calendar")
public class Calendar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="calendar_id")
	private Long calendarId;
	@Column(name="calendar_name")
	private String name;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	@OneToMany(mappedBy="calendar",
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true)
	private List<CalendarEvent> events;
	
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
	public List<CalendarEvent> getEvents() {
		return events;
	}
	public void setEvents(List<CalendarEvent> events) {
		this.events = events;
	}
}
