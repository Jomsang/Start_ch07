package ch10.exam6;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();

		try {
			String ano = "1123";			//try-catch���ص� ������ �� ������ (unchecked ���ܷ� ������� ������)
			account.deposit(ano, 1);
		}
		catch(NoAccountException e) {
			System.out.println(e.getMessage());
		}catch(BalanceLackException e) {
			System.out.println(e.getMessage());
		}

		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);

			account.withdraw(ano, 1000000);

		}catch (NoAccountException e) {
			System.out.println(e.getMessage());
		}catch(BalanceLackException e) {
			System.out.println(e.getMessage());
		}
	}

}
