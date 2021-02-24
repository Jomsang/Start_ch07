package ch10.exam6;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();

		try {
			String ano = "1123";			//try-catch안해도 오류가 안 났었음 (unchecked 예외로 만들었기 때문에)
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
