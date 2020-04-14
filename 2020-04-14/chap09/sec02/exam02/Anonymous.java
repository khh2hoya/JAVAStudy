package sec02.exam02;

public class Anonymous {
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		public void turnOn() {
			System.out.println("TV ON");			
		}
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV OFF");
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입.
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Audio On");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Audio Off");
			}
		};
		//로컬 변수 사용.
		localVar.turnOn();
		localVar.turnOff();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
