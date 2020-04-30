package sec01.exam02;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		String str1,str2,str3;
		
		
		list.add(new Board("제목0","내용0","글쓴이0"));
		
		for( int i = 0 ; i < 5; i ++ ) {
			str1 = "제목" +  (i +1);
			str2 = "내용" +  (i +1);
			str3 = "글쓴이" +  (i +1);
			
			list.add(new Board(str1,str2,str3));
		}
		
		
		list.remove(2);
		list.remove(3);
		
		for( int i = 0; i < list.size(); i++ ) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
	}

}
