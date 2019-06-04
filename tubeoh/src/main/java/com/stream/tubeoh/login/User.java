package com.stream.tubeoh.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	@Id 
	@Email
	@Column(name="user_id")
	private String id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String password;
	
	public User() {
		this.id="null";
		this.name = "null";
		this.password = "null";
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
