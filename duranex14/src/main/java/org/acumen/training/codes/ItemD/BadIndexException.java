package org.acumen.training.codes.ItemD;

public class BadIndexException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "Bad index.";
	
	public BadIndexException() {
		
	}

	public BadIndexException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public void printStackTrace() {
		System.out.println(this.message);
	}

}
