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
				System.out.println("저장위치 : ");
				int index = Integer.parseInt(input.nextLine());
				
				System.out.println("저장할값 : ");
				
				arr[index] = input.nextLine();
				
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0 ~ "+(arr.length - 1) + "까지 가능합니다.");
			}catch(Exception e) {
				System.out.println("숫자를 입력햇습니다.");
			}
			finally {
				System.out.println("다시 입력하세요.");
			}
			
		}
	}
}
