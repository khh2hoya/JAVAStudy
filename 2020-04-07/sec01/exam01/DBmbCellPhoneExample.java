package sec01.exam01;

public class DBmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DmbCellPhone 객체 생성.
		DmbCellPhone dmbCellPhone = new DmbCellPhone("내폰", "화이트" ,10);
		
		System.out.println("모델: " + dmbCellPhone.getModel());
		System.out.println("색상: " + dmbCellPhone.getColor());
		System.out.println("채널: " + dmbCellPhone.getChannel());
		
		
		//CellPhone 에서 상속받은 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아!! 방갑습니다.");
		dmbCellPhone.hangUp();
		
		//DMBCellPhone 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
