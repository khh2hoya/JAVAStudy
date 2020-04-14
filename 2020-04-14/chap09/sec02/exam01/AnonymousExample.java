package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		//익명 개체 필드 사용.
		anony.field.wake();
		//익명 객체 로컬 변수 사용.
		anony.method1();
		//익명 객체 로컬 변수 사용.
		anony.method2(
				new Person() {
					String job = "학생";
					void study() {
						System.out.println(job+"공부하자");
					}
					
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
				}
				);
	}
	
}

//세명의 익명 사람이 아침에 몇시에 일어나서 무엇을 하는지 출력
//1번 익명은 field 로 익명 객체 대입
//2번 익명은 로컬변수 값으로 익명 객체 대입
//3번 익명은 매개값으로 익명 객체 대입