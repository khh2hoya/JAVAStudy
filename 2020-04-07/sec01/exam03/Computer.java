package sec01.exam03;

public class Computer extends Calculator {
	//메소드 재정의
	//@Override 를 입력 하면 compile 에서는 Override 로 판단해서 재정의 검사를 하여 부모에 없으면 에러 출력.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 호출");
		return Math.PI * r * r;
	}
}
