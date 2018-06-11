package com.calendar.events.resource.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Haider Ali
 *
 */
public class EventSearchCritria implements Serializable{

	private static final long serialVersionUID = -8063365714785563213L;
	
	private Date startDate;
	private Date endDate;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
