package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Reader reader = new FileReader("F:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		while(true) {
			int readNum = reader.read(buffer,2,3);
			
			if( readNum == -1 ) break;
			for(int i = 0 ; i < buffer.length ; i++ ) {
				System.out.println(buffer[i]);	
			}
			
		}
	}

}
