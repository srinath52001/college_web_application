package com.example.demo.exception;


public class IdNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IdNotFoundException() {
		super();
	}

	public IdNotFoundException(String message) {
		super(message);
	}
	
}
