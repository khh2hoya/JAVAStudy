package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i= 1; i < 35; i++ ) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 kumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼족 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒷왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른족 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒷오른쪽", 18);
				break;
			}
			System.out.println("---------" + i + "------------");
			
		}
		
			

	}

}
