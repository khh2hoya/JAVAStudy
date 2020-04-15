package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member("blue");
		Member member2 = new Member("blue");
		Member member3 = new Member("red");
		Member member4 = member1;
		
		if(member1.equals(member2)) {
			System.out.println("member1 과 member2는 동등합니다.");
		}else {
			System.out.println("member1 과 member2 는 동등하지 않습니다.");
		}
		
		if( member1.equals(member3)) {
			System.out.println("member1 과 member3 는 동등합니다.");
		}else {
			System.out.println("member1 과 member3는 동등하지 않스빈다.");
		}
	
		member4.id="red";
		if(member1.equals(member4)) {
			System.out.println("member1 과 member4는 동등합니다.");
		}else {
			System.out.println("member1 과 member4 는 동등하지 않습니다.");
		}
		
		if(member1.equals(member2)) {
			System.out.println("member1 과 member2는 동등합니다.");
		}else {
			System.out.println("member1 과 member2 는 동등하지 않습니다.");
		}
	}

}
