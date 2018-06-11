package com.calendar.events.transformer;

import java.util.List;

import com.calendar.events.resource.model.CalendarEvent;

/**
 * 
 * @author Haider Ali
 *
 */
public interface ResponseTransformer {

	/** transform data layer model to resource model
	 * 
	 * @param calendarEvent
	 * @return
	 */
	public CalendarEvent transform(com.calendar.events.repository.model.CalendarEvent calendarEvent);
	/** transform data layer model list tp resource layer model list
	 * 
	 * @param calendarEvents
	 * @return
	 */
	public List<CalendarEvent> transform(List<com.calendar.events.repository.model.CalendarEvent> calendarEvents);
}
