CREATE TABLE `user` (
  `user_id` INT (11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR (128) NOT NULL,
  `user_password` VARCHAR (228) NOT NULL,
  `first_name` VARCHAR (128),
  `last_name` VARCHAR (128) NOT NULL,
  `enabled` BOOLEAN,
  PRIMARY KEY (`user_id`)
) ;

CREATE TABLE `calendar_event` (
  `calendar_event_id` INT (11) NOT NULL AUTO_INCREMENT,
  `calendar_event_title` VARCHAR (228) NOT NULL,
  `calendar_event_date` TIMESTAMP NOT NULL,
  `calendar_event_location` VARCHAR (228),
  `calendar_event_reminder` TIMESTAMP NOT NULL,
  `calendar_event_reminder_sent` BOOLEAN,
  `calendar_calendar_id` INT (11) NOT NULL,
  PRIMARY KEY (`calendar_event_id`)
) ;

CREATE TABLE `calendar` (
  `calendar_id` INT (11) NOT NULL AUTO_INCREMENT,
  `calendar_name` VARCHAR (228) NOT NULL,
  `user_id` INT (11) NOT NULL,
  PRIMARY KEY (`calendar_id`)
) ;

CREATE TABLE `attendee` (
  `attendee_id` INT (11) NOT NULL AUTO_INCREMENT,
  `attendee_first_name` VARCHAR (228),
  `attendee_last_name` VARCHAR (228) NOT NULL,
  PRIMARY KEY (`attendee_id`)
) ;

CREATE TABLE `event_attendees` (
  `event_attendee_id` INT (11) NOT NULL AUTO_INCREMENT,
  `attendee_id` INT (11) NOT NULL,
  `calendar_event_id` INT (11) NOT NULL,
  PRIMARY KEY (`event_attendee_id`)
) ;

CREATE TABLE `authority` (
  `id` INT (11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR (20),
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `user_authority` (
  `user_id` INT (11) NOT NULL,
  `authority_id` INT (11) NOT NULL
) ;