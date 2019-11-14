package com.appointment.main.form;

import java.io.Serializable;

/**
 * @author Rakesh
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String experience;
	private String domain;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, String experience, String domain) {
		super();
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.domain = domain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", experience=" + experience + ", domain=" + domain + "]";
	}


	
}
