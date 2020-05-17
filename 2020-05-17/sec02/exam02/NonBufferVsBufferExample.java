package sec02.exam02;

import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String originalFilePath1 = "K:/HACIS.exe";
		String targetFilePath1 = "F:/Temp/HACIS1.exe";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = "K:/HACIS.exe";
		String targetFilePath2 = "F:/Temp/HACIS2.exe";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼를 사용하지 않았을때: \t" + nonBufferTime + "ns");
		
		long bufferTime = copy(bis,bos);
		System.out.println("버퍼를 사용했을때: \t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if( data == -1 ) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}
}
