package sec01.exam01;

import sec01.exam01.sub.CellPhone;

public class DmbCellPhone extends CellPhone{
	//필드
	
	int channel;
	
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		super(model,color);
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
		
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel +"번으로 변경되었습니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 수신합니다.");
	}

}
