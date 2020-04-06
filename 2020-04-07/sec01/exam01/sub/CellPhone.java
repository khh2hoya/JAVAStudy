package sec01.exam01.sub;

public class CellPhone {
	//기본 전화기를 만듬.
	
	//필드
	String model;
	String color;
	
	//생성자.
	public CellPhone(String model, String color) {
		
		System.out.println("CellPhone 생성자 호출.");
		this.model = model;
		this.color = color;
		
	}
	
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	//메소드
	public void powerOn() { System.out.println("전원을 컵니다.");}
	public void powerOff() { System.out.println("전원을 끕니다.");}
	public void bell() { System.out.println("벨이 울립니다.");}
	public void sendVoice(String message) { System.out.println("자기:" + message);}
	public void receiveVoice(String message) { System.out.println("상대방:" + message);}
	public void hangUp() { System.out.println("전화를 끊습니다.");}
	
}
