package com.calendar.events.service;

import java.util.Date;
import java.util.List;

import com.calendar.events.repository.model.CalendarEvent;

/**
 * 
 * @author Haider Ali
 *
 */
public interface ICalendarService {

	/** responsible to find all records from DB
	 * 
	 * @return
	 */
	public List<CalendarEvent> findAll();
	/** reponsible to fetch events from start date to end date
	 * 
	 * @return
	 */
	public List<CalendarEvent> findEvents(Date startDate, Date endDate);
	/** responsible to save calendar event to DB
	 * 
	 * @param event
	 * @return
	 */
	public CalendarEvent save(CalendarEvent event) throws Exception;
	/** responsible to update calendar event
	 * 
	 * @param event
	 * @return
	 */
	public CalendarEvent update(CalendarEvent event) throws Exception;
	/** responsible to delete event
	 * 
	 * @param event
	 * @return
	 */
	public void delete(Long eventId) throws Exception;
}
