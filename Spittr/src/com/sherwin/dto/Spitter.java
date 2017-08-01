package com.sherwin.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
	
	private long id;
	private String firstName;
	private String lastName;
	@NotNull
	@Size(max=20)
	private String username;
	private String password;
	
	public Spitter(){}
	public Spitter(String username, String password, String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}
	
	public Spitter(long id, String username, String password, String firstName, String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	  @Override
	  public boolean equals(Object that) {
	    return EqualsBuilder.reflectionEquals(this, that, "firstName", "lastName", "username", "password");
	  }
	  
	  @Override
	  public int hashCode() {
	    return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "username", "password");
	  }	
}
