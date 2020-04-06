package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면저기:" + calculator.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("원면저기:" + computer.areaCircle(r));

	}

}
