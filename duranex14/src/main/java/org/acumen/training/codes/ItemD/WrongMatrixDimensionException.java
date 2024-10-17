package org.acumen.training.codes.ItemD;

public class WrongMatrixDimensionException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "Error: Wrong matrix dimensions.";
	
	public WrongMatrixDimensionException() {}
	
	public WrongMatrixDimensionException(String message) {
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
