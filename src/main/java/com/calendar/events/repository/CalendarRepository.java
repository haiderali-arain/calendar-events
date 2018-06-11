package com.calendar.events.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.calendar.events.repository.model.CalendarEvent;

/**
 * 
 * @author Haider Ali
 *
 */
@Repository
public interface CalendarRepository extends JpaRepository<CalendarEvent, Long> {
	
	@Query("select c from CalendarEvent c where"
			+ " CONVERT(c.eventDate AS DATE) >= CONVERT(:startDate AS DATE) AND"
			+ " CONVERT(c.eventDate AS DATE) <= CONVERT(:endDate AS DATE) ")
	public List<CalendarEvent> findEvents(@Param("startDate") Date startDate, @Param("endDate") Date endDate); 
}
