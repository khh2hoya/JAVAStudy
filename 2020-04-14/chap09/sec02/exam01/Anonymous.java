package sec02.exam01;

public class Anonymous  {
	//필드 초기값으로 대입
	Person field = new Person() {
		String job = "직장인";
		void work() {
			System.out.println(job + "출근 합니다.");
		}
		void wake() {
			System.out.println(" 6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		//로컬변수값으로 대입.
		Person localVar = new Person() {
			String job = "일반인";
			void walk() {
				System.out.println(job + "산책합니다.");
			}
			
			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("7시에 일어남");
				walk();
			}
		};
		//로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
