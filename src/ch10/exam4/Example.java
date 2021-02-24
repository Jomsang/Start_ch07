package ch10.exam4;
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
				
				
			}catch(NumberFormatException e){
				System.out.println("���ڸ� �����մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0 ~ "+(arr.length - 1) + "���� �����մϴ�.");
			}
			finally {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
	}
}
