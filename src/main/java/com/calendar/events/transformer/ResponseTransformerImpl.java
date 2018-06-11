package com.calendar.events.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.calendar.events.resource.model.Attendee;
import com.calendar.events.resource.model.Calendar;
import com.calendar.events.resource.model.CalendarEvent;
import com.calendar.events.resource.model.User;

/**
 * 
 * @author Haider Ali
 *
 */
@Component
public class ResponseTransformerImpl implements ResponseTransformer {

	/** transforms repo event to resource event
	 * 
	 */
	@Override
	public CalendarEvent transform(com.calendar.events.repository.model.CalendarEvent calendarEvent) {
		CalendarEvent cEvent = new CalendarEvent();
		cEvent.setCalendarEventId(calendarEvent.getCalendarEventId());
		cEvent.setEventDate(calendarEvent.getEventDate());
		cEvent.setLocation(calendarEvent.getLocation());
		cEvent.setReminder(calendarEvent.getReminder());
		cEvent.setReminderSent(calendarEvent.isReminderSent());
		cEvent.setTitle(calendarEvent.getTitle());
		cEvent.setAttendees(transformAttendees(calendarEvent.getAttendees()));
		cEvent.setCalendar(transformCalendar(calendarEvent.getCalendar()));
		
		return cEvent;
	}

	@Override
	public List<CalendarEvent> transform(List<com.calendar.events.repository.model.CalendarEvent> calendarEvents) {
		List<CalendarEvent> events = new ArrayList<CalendarEvent>();
		if(!(calendarEvents == null || calendarEvents.isEmpty())){
			calendarEvents.forEach( e -> events.add(transform(e)));
		}
		return events;
	}
	
	private List<Attendee> transformAttendees(List<com.calendar.events.repository.model.Attendee> attendees){
		List<Attendee> eventAttendees = new ArrayList<Attendee>();
		
		if(!(attendees == null || attendees.isEmpty())){
			attendees.forEach( a -> eventAttendees.add(transformAttendees(a)));
		}
		
		return eventAttendees;
	}
	
	private Attendee transformAttendees(com.calendar.events.repository.model.Attendee attendee){
		Attendee eventAttendee = new Attendee();
		
		eventAttendee.setAttendeeId(attendee.getAttendeeId());
		eventAttendee.setFirstName(attendee.getFirstName());
		eventAttendee.setLastName(attendee.getLastName());
		
		return eventAttendee;
	}
	
	private Calendar transformCalendar(com.calendar.events.repository.model.Calendar calendar){
		Calendar c = new Calendar();
		c.setCalendarId(calendar.getCalendarId());
		c.setName(calendar.getName());
		c.setUser(transformUser(calendar.getUser()));	
		
		return c;
	}
	
	private User transformUser(com.calendar.events.repository.model.User u){
		User user = new User();
		
		user.setUserId(u.getUserId());
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setUserName(u.getLastName());
		
		return user;
	}

}
