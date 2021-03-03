package ch18.exam6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:\\Ch07Start\\ch07Start\\src\\ch18\\exam6\\photo1.jpg";	
		String filePath1 = "C:\\Ch07Start\\ch07Start\\src\\ch18\\exam6\\photo2.jpg";
		
		
		try {
			InputStream is = new FileInputStream(filePath);
			OutputStream os = new FileOutputStream(filePath1);
			
			byte[] data = new byte[1024];
			int readNum = -1;
			while((readNum = is.read(data)) != -1) { // ****
				os.write(data, 0 , readNum);	//0 인덱스부터 시작해서 
			}
			os.flush();
			
			is.close();
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
