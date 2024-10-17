package org.acumen.training.codes.ItemD;

public class InvalidMatrixOperationException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "Error: Only one matrix input.";
	
	public InvalidMatrixOperationException() {}
	
	public InvalidMatrixOperationException(String message) {
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
