package sec01.exam02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key,String> hashMap = new HashMap<Key, String> ();
		
		
		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "value2");
		hashMap.put(new Key(1), "value3");
		
		System.out.println(hashMap.size());
		
		//식별키 new Key(1)로 " 홍길동" 저장함.
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 new Key(1) 로 " 홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		HashMap<Member,String> hashMap2 = new HashMap<Member, String> ();
		
		hashMap2.put(new Member("fall"), "value1");
		hashMap2.put(new Member("winter"), "value2");
		hashMap2.put(new Member("fall"), "value3");
		
		System.out.println(hashMap2.size());
		
	}
}
