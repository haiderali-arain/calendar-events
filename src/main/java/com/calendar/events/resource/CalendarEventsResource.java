package com.calendar.events.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calendar.events.facade.CalendarFacade;
import com.calendar.events.resource.model.CalendarEvent;
import com.calendar.events.resource.model.EventSearchCritria;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author Haider Ali
 *
 */
@RestController
@RequestMapping("api/v1/calendar")
@Api("Calendar API")
public class CalendarEventsResource {
	
	@Autowired
	private CalendarFacade calendarFacade;
	/** responsible to return all events
	 * 
	 * @return ResponseEntity<List<CalendarEvent>>
	 */
	@ApiOperation("This resource returns all events present in system.")
	@GetMapping(path="${calendar.events.all-events}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CalendarEvent>> getAllCalendarEvents(){
		return new ResponseEntity<List<CalendarEvent>>(calendarFacade.findAll(), HttpStatus.OK);
	}
	
	/** responsible to return todays events
	 * 
	 * @return
	 */
	@ApiOperation("This resource returns todays events present in system.")
	@GetMapping(path="${calendar.events.todays-events}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CalendarEvent>> getTodaysCalendarEvents(){
		return new ResponseEntity<List<CalendarEvent>>(calendarFacade.findTodaysEvents(), HttpStatus.OK);
	}
	
	/** responsible to return events base on criteria start date and end date
	 * 
	 * @return
	 */
	@ApiOperation("This resource returns todays events present in system.")
	@PostMapping(path="${calendar.events.get-events}", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCalendarEvents(@RequestBody EventSearchCritria ceriteria){
		if(ceriteria.getStartDate() != null && ceriteria.getEndDate() != null){
			return new ResponseEntity<List<CalendarEvent>>(calendarFacade.findEvents(ceriteria), HttpStatus.OK);			
		}
		return new ResponseEntity<String>("Start and End date both are required.", HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param event
	 * @return
	 */
	@ApiOperation("This resource creates event in system.")
	@PostMapping(path="${calendar.events}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CalendarEvent> createEvent(CalendarEvent event){
		try{
			event = calendarFacade.save(event);	
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return new ResponseEntity<CalendarEvent>(event, HttpStatus.OK);
	}
		
	
	
}
