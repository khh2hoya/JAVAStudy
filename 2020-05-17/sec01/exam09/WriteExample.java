package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("F:/Temp/test9.txt");
		
		char[] array = {'A', 'B' , 'C'};
		
		writer.write(array);
		

		writer.flush();
		writer.close();
		
	}

}
