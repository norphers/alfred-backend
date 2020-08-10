package com.alfred.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class Admin extends AppUser {

	public Admin() {
		super();
		this.setRole(Role.ADMIN);
	}

	public Admin(String firstName, String lastName, String email, String password, Role role) {
		super(firstName, lastName, email, password, role);
	}

	// empty email-password
	
	
}
