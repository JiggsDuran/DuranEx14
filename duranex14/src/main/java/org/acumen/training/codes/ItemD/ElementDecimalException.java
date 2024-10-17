package org.acumen.training.codes.ItemD;

public class ElementDecimalException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "Invalid element value: [floating-point]";
	
	public ElementDecimalException() {}

	public ElementDecimalException(String message) {
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
