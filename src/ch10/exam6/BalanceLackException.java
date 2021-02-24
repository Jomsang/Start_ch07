package ch10.exam6;

public class BalanceLackException extends Exception { //Exception이나 RuntimeException을 상속 받음 //언첵이냐 첵이냐
	public BalanceLackException() {}	//기본 생성자 생성 후 밑에
	public BalanceLackException(String message) {	//상속하는 Exception의 기능을 불름
		super(message);
	}
}
