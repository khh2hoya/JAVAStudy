package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Reader reader = new FileReader("F:/Temp/test8.txt");
		
		char[] buffer = new char[100];
		
		while(true) {
			int readNum = reader.read(buffer);
			
			if( readNum == -1 ) break;
			for(int i = 0 ; i < readNum ; i++ ) {
				System.out.println(buffer[i]);	
			}
			
		}
	}

}
