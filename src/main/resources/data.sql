
INSERT INTO USER(user_id, username, user_password, first_name, last_name, enabled) VALUES (1, 'user', '$2a$10$KLN/j8EF3k5UrdyW7NdCuONYMsIGMzY.gcSHjT09TVCxcnFr8rn42', 'John', 'Doe', 1);

INSERT INTO authority (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);

INSERT INTO attendee(attendee_id, attendee_first_name, attendee_last_name) VALUES (1, 'John', 'Doe');

INSERT INTO calendar(calendar_id, calendar_name, user_id) VALUES (1, 'John Calendar', 1);


INSERT INTO calendar_event(calendar_event_id, calendar_event_title, calendar_event_date, calendar_event_location, calendar_event_reminder, calendar_event_reminder_sent,calendar_calendar_id) VALUES (1, 'Beach Bash at Bell', '2018-06-11 19:23:44' , 'Bell Park Milton', '2018-06-11 19:23:44',0, 1);
INSERT INTO calendar_event(calendar_event_id, calendar_event_title, calendar_event_date, calendar_event_location, calendar_event_reminder, calendar_event_reminder_sent,calendar_calendar_id) VALUES (2, 'Foods Festival', '2018-06-12 19:23:44', 'Milton Ave', '2018-06-12 19:23:44', 0, 1);

INSERT INTO event_attendees(calendar_event_id, attendee_id) VALUES (1, 1);
INSERT INTO event_attendees(calendar_event_id, attendee_id) VALUES (2, 1);