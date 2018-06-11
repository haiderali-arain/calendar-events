package com.calendar.events.resource.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Haider Ali
 *
 */
public class CalendarEvent implements Serializable {

	private static final long serialVersionUID = -2350119543454267703L;
	private Long calendarEventId;
	private String title;
	private Date eventDate; //event date and time
	private String location;
	private List<Attendee> attendees;
	private Date reminder; 	//reminder time
	private boolean reminderSent;
	private Calendar calendar;
	
	public Long getCalendarEventId() {
		return calendarEventId;
	}
	public void setCalendarEventId(Long calendarEventId) {
		this.calendarEventId = calendarEventId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Attendee> getAttendees() {
		return attendees;
	}
	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}
	public Date getReminder() {
		return reminder;
	}
	public void setReminder(Date reminder) {
		this.reminder = reminder;
	}
	public boolean isReminderSent() {
		return reminderSent;
	}
	public void setReminderSent(boolean reminderSent) {
		this.reminderSent = reminderSent;
	}
	public Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
}
