package com.calendar.events.transformer;

import java.util.List;

import com.calendar.events.resource.model.CalendarEvent;

/**
 * 
 * @author Haider Ali
 *
 */
public interface RequestTransFormer {
	/** transform resource layer model to data model
	 * 
	 * @param calendarEvent
	 * @return
	 */
	public com.calendar.events.repository.model.CalendarEvent transform(CalendarEvent calendarEvent);
	/** transform resource layer model list tp data layer model list
	 * 
	 * @param calendarEvents
	 * @return
	 */
	public List<com.calendar.events.repository.model.CalendarEvent> transform(List<CalendarEvent> calendarEvents);
}
