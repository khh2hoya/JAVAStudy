package sec01.exam04;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new BeepTask();
		thread.start();
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}
