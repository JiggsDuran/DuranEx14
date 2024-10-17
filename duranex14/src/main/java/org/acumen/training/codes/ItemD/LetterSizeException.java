package org.acumen.training.codes.ItemD;

public class LetterSizeException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "Invalid size.";
	
	public LetterSizeException() {}
	
	public LetterSizeException(String message) {
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
