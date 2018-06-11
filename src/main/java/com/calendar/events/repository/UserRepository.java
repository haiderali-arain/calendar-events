package com.calendar.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calendar.events.repository.model.User;


/**
 * 
 * @author Haider Ali
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   public User findByUserName(String userName);
}
