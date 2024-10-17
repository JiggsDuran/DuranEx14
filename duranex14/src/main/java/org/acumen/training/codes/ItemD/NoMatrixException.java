package org.acumen.training.codes.ItemD;

public class NoMatrixException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "Error: No matrix input.";
	
	public NoMatrixException() {}
	
	public NoMatrixException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(this.message);
	}
}
