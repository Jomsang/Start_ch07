package ch10.exam2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) throws FileNotFoundException  {

		Scanner input  = new Scanner(System.in);




		while(true) {


			try {
				int value = Integer.parseInt(input.nextLine());
				System.out.println("value "+value);
			}
			catch(NumberFormatException e){
				System.out.println("���ڸ� �����մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}finally {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
	}
}
