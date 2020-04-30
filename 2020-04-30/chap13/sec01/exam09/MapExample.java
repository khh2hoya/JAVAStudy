package sec01.exam09;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("blue",96);
		map.put("hong",99);
		map.put("white",92);
		map.put("khh",42);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer> entry = entryIterator.next();
			int value = entry.getValue();
			totalScore += value;
			if( value > maxScore ) {
				maxScore = value;
				name = entry.getKey();
			}				
		}
		
		System.out.println("이름:" + name);
		System.out.println("최고정수:" + maxScore);
		System.out.println("총점:" + totalScore);
		
	}

}
