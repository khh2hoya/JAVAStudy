package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("F:/Temp/test1db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
