package sec02.exam04;

public class PrintThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("실행중2 ");
			if(Thread.interrupted()) break;
		}
		
		
		System.out.println("자원 정리2");
		System.out.println("실행 종료2");
	}
}
