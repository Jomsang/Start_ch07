package ch10.exam3;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) throws FileNotFoundException  {

		Scanner input  = new Scanner(System.in);
		String [] arr = new String[3];



		while(true) {


			try {
				System.out.println("������ġ : ");
				int index = Integer.parseInt(input.nextLine());
				
				System.out.println("�����Ұ� : ");
				
				arr[index] = input.nextLine();
				
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0 ~ "+(arr.length - 1) + "���� �����մϴ�.");
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��޽��ϴ�.");
			}
			finally {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
	}
}
