package sec01.exam05;


public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + " 을 검색하빈다.");
	}

	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV 를 꼅니다.");
		
	}
	//turnOff() 추상메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//setVolume() 추상메소드의 실체 메소드
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if( volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
