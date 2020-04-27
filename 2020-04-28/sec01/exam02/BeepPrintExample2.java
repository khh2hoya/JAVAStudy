package sec01.exam02;

import sec01.exam04.BeepTask;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}

}
