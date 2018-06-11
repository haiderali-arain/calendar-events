package com.calendar.events.security.service;

import java.io.Serializable;

/**
 * 
 * @author Haider Ali
 *
 */
public class JwtAuthenticationResponse implements Serializable {

 	private static final long serialVersionUID = -8759195167607166359L;
	private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
