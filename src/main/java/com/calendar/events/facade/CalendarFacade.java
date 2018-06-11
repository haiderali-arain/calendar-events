package com.calendar.events.facade;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.calendar.events.resource.model.CalendarEvent;
import com.calendar.events.resource.model.EventSearchCritria;
import com.calendar.events.service.ICalendarService;
import com.calendar.events.transformer.RequestTransFormer;
import com.calendar.events.transformer.ResponseTransformer;

/**
 * 
 * @author Haider Ali
 *
 */
@Component
public class CalendarFacade {
	private ICalendarService calendarService;
	private RequestTransFormer requestTransformer;
	private ResponseTransformer responseTransformer;
	
	public CalendarFacade(ICalendarService calendarService,	
			RequestTransFormer requestTransformer, ResponseTransformer responseTransformer){
		this.calendarService = calendarService;
		this.requestTransformer = requestTransformer;
		this.responseTransformer = responseTransformer;
	}
	
	/** responsible to find all records from DB
	 * 
	 * @return
	 */
	public List<CalendarEvent> findAll(){
		return responseTransformer.transform(calendarService.findAll());
	}
	
	/** responsible to find todays records from DB
	 * 
	 * @return
	 */
	public List<CalendarEvent> findTodaysEvents(){
		return responseTransformer.transform(calendarService.findEvents(new Date(), new Date()));
	}
	
	/** responsible to find events based on criteria records from DB
	 * 
	 * @return
	 */
	public List<CalendarEvent> findEvents(EventSearchCritria criteria){
		return responseTransformer.transform(calendarService.findEvents(criteria.getStartDate(), criteria.getEndDate()));
	}
	
	/** responsible to save calendar event to DB
	 * 
	 * @param event
	 * @return
	 */
	public CalendarEvent save(CalendarEvent event) throws Exception {
		if(event != null){
			com.calendar.events.repository.model.CalendarEvent calendarEvent = requestTransformer.transform(event);
			return responseTransformer.transform(calendarService.save(calendarEvent));
		}
		return null;
	}
	/** responsible to update calendar event
	 * 
	 * @param event
	 * @return
	 */
	public CalendarEvent update(CalendarEvent event) throws Exception {
		return null;
	}
	/** responsible to delete event
	 * 
	 * @param event
	 * @return
	 */
	public Boolean delete(CalendarEvent event) throws Exception {
		return false;
	}
	
	
}
