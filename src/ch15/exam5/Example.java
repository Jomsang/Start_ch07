package ch15.exam5;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();//Ű,��� �� ��Ʈ�� Ÿ���϶� Ưȭ�� Ŭ����.
		String path = Example.class.getResource("database.properties").getPath(); //Example���� �������� ������ ã�µ�, �������� ���� ��η� ã���� ��(database������ ��� �ֵ� ��� ����)
		prop.load(new FileReader(path));
		String driver = prop.getProperty("driver");//getpath�� getproperty ��� �ٽ� Ȯ���ϱ�
		System.out.println(driver); //database,pro~ ������ �ѱ��� �Է��ϸ� '�ƽ�Ű�ڵ�' ������ ��Ÿ��. (�ѱ��� ���� �� ��Ű�� ����) - ����,Ư����ȣ,���ڸ� ����.
		
		
		String nation = prop.getProperty("nation"); //properties������ �ƽ�Ű�ڵ�� �ߴ°� �����ΰ���.
		System.out.println(nation);
		
	}

}
