package com.calendar.events.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.calendar.events.repository.CalendarRepository;
import com.calendar.events.repository.model.CalendarEvent;

/** This class is implementation of ICalendarService. This implementation is 
 * responsible to perform CRUD operations for calendar event
 * 
 * @author Haider Ali
 *
 */
@Service
public class CalendarServiceImpl implements ICalendarService {

	private CalendarRepository calendarRepository;
	
	public CalendarServiceImpl(CalendarRepository calendarRepository){
		this.calendarRepository = calendarRepository;
	}
	
	/** responsible to find all records from DB
	 * 
	 * @return
	 */
	@Override
	public List<CalendarEvent> findAll(){
		return calendarRepository.findAll();
	}
	
	public List<CalendarEvent> findEvents(Date startDate, Date endDate){
		return calendarRepository.findEvents(startDate, endDate);
	}
	
	/** responsible to save calendar event to DB
	 * 
	 * @param event
	 * @return
	 */
	@Override
	public CalendarEvent save(CalendarEvent event) throws Exception {
		return calendarRepository.save(event);
	}
	
	/** responsible to update calendar event
	 * 
	 * @param event
	 * @return
	 */
	@Override
	public CalendarEvent update(CalendarEvent event) throws Exception {
		//TODO fetch update and save
		return calendarRepository.save(event);
	}
	
	/** responsible to delete event
	 * 
	 * @param event
	 * @return
	 */
	@Override
	public void delete(Long eventId) throws Exception {
//		calendarRepository.deleteById(eventId);
	}
}
