package com.calendar.events.repository.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 
 * @author Haider Ali
 *
 */
@Entity
@Table(name="calendar_event")
public class CalendarEvent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="calendar_event_id")
	private Long calendarEventId;
	@Column(name="calendar_event_title")
	private String title;
	@Column(name="calendar_event_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date eventDate; //event date and time
	@Column(name="calendar_event_location")
	private String location;
	@ManyToMany
	@JoinTable(
			name="event_attendees",
			joinColumns={@JoinColumn(name="calendar_event_id", referencedColumnName="calendar_event_id")},
			inverseJoinColumns={@JoinColumn(name="attendee_id", referencedColumnName="attendee_id")})
	private List<Attendee> attendees;
	@Column(name="calendar_event_reminder")
	@Temporal(TemporalType.TIMESTAMP)
	private Date reminder; 	//reminder time
	@Column(name="calendar_event_reminder_sent")
	private boolean reminderSent;
	@ManyToOne(targetEntity=Calendar.class, fetch = FetchType.EAGER)
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
