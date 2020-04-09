package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.turnOff();

	}

}
