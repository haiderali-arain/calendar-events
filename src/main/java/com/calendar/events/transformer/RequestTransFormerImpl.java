package com.calendar.events.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.calendar.events.repository.model.Calendar;
import com.calendar.events.repository.model.CalendarEvent;
import com.calendar.events.repository.model.User;
import com.calendar.events.resource.model.Attendee;

/**
 * 
 * @author Haider Ali
 *
 */
@Component
public class RequestTransFormerImpl implements RequestTransFormer {

	/** transform resource event to repo event
	 * 
	 */
	@Override
	public CalendarEvent transform(com.calendar.events.resource.model.CalendarEvent calendarEvent) {
		CalendarEvent event = new CalendarEvent();
		event.setCalendarEventId(calendarEvent.getCalendarEventId());
		event.setTitle(calendarEvent.getTitle());
		event.setEventDate(calendarEvent.getEventDate());
		event.setLocation(calendarEvent.getLocation());
		event.setAttendees(transformAttendees(calendarEvent.getAttendees()));
		event.setReminder(calendarEvent.getReminder());
		event.setReminderSent(calendarEvent.isReminderSent());
		event.setCalendar(transformCalendar(calendarEvent.getCalendar()));
		
		return event;
	}

	@Override
	public List<CalendarEvent> transform(List<com.calendar.events.resource.model.CalendarEvent> calendarEvents) {
		List<CalendarEvent> events = new ArrayList<CalendarEvent>();
		if(!(calendarEvents == null || calendarEvents.isEmpty())){
			calendarEvents.forEach( e -> events.add(transform(e)));
		}
		return events;
	}
	
	private List<com.calendar.events.repository.model.Attendee> transformAttendees(List<Attendee> attendees){
		List<com.calendar.events.repository.model.Attendee> eventAttendees = new ArrayList<com.calendar.events.repository.model.Attendee>();
		
		if(!(attendees == null || attendees.isEmpty())){
			attendees.forEach( a -> eventAttendees.add(transformAttendees(a)));
		}
		
		return eventAttendees;
	}
	
	private com.calendar.events.repository.model.Attendee transformAttendees(Attendee attendee){
		com.calendar.events.repository.model.Attendee eventAttendee = new com.calendar.events.repository.model.Attendee();
		
		eventAttendee.setAttendeeId(attendee.getAttendeeId());
		eventAttendee.setFirstName(attendee.getFirstName());
		eventAttendee.setLastName(attendee.getLastName());
		
		return eventAttendee;
	}
	
	private Calendar transformCalendar(com.calendar.events.resource.model.Calendar calendar){
		Calendar c = new Calendar();
		c.setCalendarId(calendar.getCalendarId());
		c.setName(calendar.getName());
		c.setUser(transformUser(calendar.getUser()));	
		
		return c;
	}
	
	private User transformUser(com.calendar.events.resource.model.User u){
		User user = new User();
		
		user.setUserId(u.getUserId());
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setUserName(u.getLastName());
		
		return user;
	}

}
