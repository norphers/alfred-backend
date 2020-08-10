package com.alfred.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User extends AppUser {

	public User() {
		super();
		this.setRole(Role.USER);
	}

	public User(String firstName, String lastName, String email, String password, Role role) {
		super(firstName, lastName, email, password, role);
	}
	
	// empty email-password

}
