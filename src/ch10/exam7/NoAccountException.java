package ch10.exam7;

public class NoAccountException extends RuntimeException {
	public NoAccountException() {}
	
	
	public NoAccountException(String message) {
		super(message);
	}
}
