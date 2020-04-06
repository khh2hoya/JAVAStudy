package sec01.exam04;

public class SuperSonicAirplane extends AirPlane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if( flyMode == SUPERSONIC) {
			System.out.println("초음속으로 날아갑니다.");
		}else {
			super.fly();
		}
	}

}

//재정의 하는 방법  Ctrl + Space 를 누르면 자동완성으로 만들수 있음. 