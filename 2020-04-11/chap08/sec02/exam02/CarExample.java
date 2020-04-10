package sec02.exam02;

public class CarExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi taxi =new Texi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
