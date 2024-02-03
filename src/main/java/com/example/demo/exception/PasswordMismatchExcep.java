package com.example.demo.exception;

public class PasswordMismatchExcep extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordMismatchExcep() {
		super();
	}
	
	public PasswordMismatchExcep(String message) {
		super(message);
	}

	
}
