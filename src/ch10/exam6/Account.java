package ch10.exam6;

public class Account {
	private int balance = 10000;

	public void deposit(String account, int money) throws NoAccountException, BalanceLackException{//입금을 하려면 계좌와 돈이 필요
		if(account == null) { //만약 입금하려는데 계좌가 없을시 "계좌가 없을때를 대비해 예외를 던짐"

			//예외 발생 코드
			throw new NoAccountException("입금 계좌가 없습니다");
		}else if(money <= 0)	{
			throw new BalanceLackException("0원 이상을 입금하십시오.");
		}else {
			System.out.println("입금 성공");
		}
	}
	public void withdraw(String account, int money) throws NoAccountException, BalanceLackException  {

		if(account == null) { 

			//예외 발생 코드
			throw new NoAccountException("입금 계좌가 없습니다");
		}else if(money > balance)	{
			throw new BalanceLackException("잔고가 부족합니다.");
		}else {
			System.out.println("출금 성공");
		}



	}
}
