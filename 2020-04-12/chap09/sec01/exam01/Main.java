package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		//인스텀스 맴버 클래스 객체 생성.
		A.B b = a.new B();
		b.feild1 = 3;
		b.method1();
		
		//정적멤버 클래스 객체 생성.
		A.C c = new A.C();
		c.feild1 = 1;
		c.method1();
		A.C.field2 = 23;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		

	}

}
