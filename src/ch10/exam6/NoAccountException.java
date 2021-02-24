package ch10.exam6;

public class NoAccountException extends RuntimeException {
	public NoAccountException() {}
	
	
	public NoAccountException(String message) {
		super(message);
	}
}
