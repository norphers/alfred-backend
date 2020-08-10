package com.alfred.exceptions;

public class EmptyFieldException extends Exception {

	private String field;
	private String message;
	
	public EmptyFieldException(String field) {
		super("The field " + field + " cannot be empty." );
		this.field = field;
	}
	
	
}
