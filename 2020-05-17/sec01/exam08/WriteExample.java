package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("F:/Temp/test8.txt");
		
		char[] array = {'A', 'B' , 'C' ,'D' , 'E'};
		
		writer.write(array,1,3);
		

		writer.flush();
		writer.close();
		
	}

}
