package sec01.exam02;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id= id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if( id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode(); // String의 hashCode 는 문자열이 같은면 같다고 리턴한다.
	}
	
	
}
