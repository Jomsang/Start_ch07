package ch06_exam_report;
import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100]; //��ü �迭 ( ���� �޸� ���������� �� �ʿ���)
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;

		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("------------------------------------------");
			System.out.print("�޴� ����> ");


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
		System.out.println("���α׷� ����");


	}
	private static void withdraw() {
		System.out.println("----");
		System.out.println("���");
		System.out.println("----");
		System.out.print("���¹�ȣ : ");
		String ano = input.next();
		System.out.print("���ݾ�");
		int money = input.nextInt();

		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");

	}
	private static void deposit() {
		System.out.println("----");
		System.out.println("����");
		System.out.println("----");
		System.out.print("���¹�ȣ : ");
		String ano = input.next();
		System.out.print("���ݾ�");
		int money = input.nextInt();

		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("��� : �Ա��� �����Ǿ����ϴ�.");
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
		System.out.println("���»���");
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
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ : ");
		String ano = input.next();

		System.out.print("������ : ");
		String owner = input.next();

		System.out.print("�ʱ� �Աݾ� : ");
		int balance = input.nextInt();

		Account account = new Account(ano, owner, balance);

		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}

	}

}
