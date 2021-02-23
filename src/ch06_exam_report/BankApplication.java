package ch06_exam_report;
import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100]; //객체 배열 ( 따로 메모리 생성과정이 더 필요함)
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;

		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("------------------------------------------");
			System.out.print("메뉴 선택> ");


			int selectNo = input.nextInt();

			if(selectNo == 1) {
				createAccount();
			}

			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}


		}
		System.out.println("프로그램 종료");


	}
	private static void withdraw() {
		System.out.println("----");
		System.out.println("출금");
		System.out.println("----");
		System.out.print("계좌번호 : ");
		String ano = input.next();
		System.out.print("예금액");
		int money = input.nextInt();

		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");

	}
	private static void deposit() {
		System.out.println("----");
		System.out.println("예금");
		System.out.println("----");
		System.out.print("계좌번호 : ");
		String ano = input.next();
		System.out.print("예금액");
		int money = input.nextInt();

		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 입금이 성공되었습니다.");
	}


	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String indexAno = accountArray[i].getAno();
				if(indexAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");

		for(int i = 0; i < accountArray.length; i++) {
			Account account =accountArray[i];
			if(accountArray[i] !=null) {
				System.out.print(account.getAno()+" \t ");
				System.out.print(account.getOwner()+" \t ");
				System.out.print(account.getBalance()+" \t ");
				System.out.println();
			}
		}


	}
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = input.next();

		System.out.print("계좌주 : ");
		String owner = input.next();

		System.out.print("초기 입금액 : ");
		int balance = input.nextInt();

		Account account = new Account(ano, owner, balance);

		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}

	}

}
