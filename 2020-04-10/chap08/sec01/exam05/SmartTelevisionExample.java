package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc =  tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		Searchable searchable = tv;
		searchable.search("http://naver.com");
		
		

	}

}
