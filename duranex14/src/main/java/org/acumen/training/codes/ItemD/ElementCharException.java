package org.acumen.training.codes.ItemD;

public class ElementCharException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "No String or character input.";
	
	public ElementCharException(String message) {
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
