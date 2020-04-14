package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("실행~");
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("정상실행");
			
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
