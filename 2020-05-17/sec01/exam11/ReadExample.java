package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("F:/Temp/test7.txt");
		
		while(true) {
			int data = reader.read();
			if( data == -1 ) break;
			System.out.println((char)data);
		}
	}

}
