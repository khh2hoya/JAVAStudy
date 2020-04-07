package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(texi);

	}

}

//드라이버 객체에  어떤 매개변수를 받으면 그거에 맞는 class의 메소드 를 사용한다.
// 운전자가 버스를 운전하면 버스가 달리는거고, 택시를 받아서 운전하면 택스를 운전한다.
