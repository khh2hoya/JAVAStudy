package sec01.exam03;

import java.awt.Toolkit;

public class BeepPrintExampe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명 Thread
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( int i = 0; i < 5; i++ ) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {}
				}
			}
		});
		
		thread.start();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
