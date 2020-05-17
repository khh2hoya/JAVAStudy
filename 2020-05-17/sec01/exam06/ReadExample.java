package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("F:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		int readBufferNum = is.read(buffer,2,3);
		
		if(readBufferNum != -1 ) {
			for(int i = 0 ; i < buffer.length ; i++ ) {
				System.out.println(buffer[i]);
			}
		}
	}

}
