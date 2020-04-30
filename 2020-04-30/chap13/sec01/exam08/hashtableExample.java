package sec01.exam08;
import java.util.*;

public class hashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new Hashtable<String,String>();
		
		map.put("sprint","12");
		map.put("summer","123");
		map.put("fall", "1234");
		map.put("winter","12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력 해주세요");
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			System.out.print("비밀번호:");
			String pwd = scanner.nextLine();
			System.out.println();
			
			if( map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인되었습니다.");					
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("이이디가 존재하지 않습니다.");
			}
		}
		
	}

}
