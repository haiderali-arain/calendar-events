package com.calendar.events.security;

import java.io.Serializable;

/**
 * 
 * @author Haider Ali
 *
 */
public class  JwtAuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 1671522367218110581L;
	private String username;
    private String password;

    public JwtAuthenticationRequest() {
        super();
    }

    public JwtAuthenticationRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
