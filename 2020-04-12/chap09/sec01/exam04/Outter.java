package sec01.exam04;


// 로컬 클래스에서 필드를 final 로 선언 되기 때문에 수정 할수 없다.
public class Outter {
	
	//자바 7
	public void method1( final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
