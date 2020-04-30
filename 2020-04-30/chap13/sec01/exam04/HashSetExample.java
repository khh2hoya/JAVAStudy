package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("servlet/JSP");
		set.add("Java");
		set.add("iBATTS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATTS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		for(String element : set ) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
