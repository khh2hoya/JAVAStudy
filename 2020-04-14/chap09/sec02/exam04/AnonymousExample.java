package sec02.exam04;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
		anony.setField(30);
		anony.method(0, 0);
		
		anony.method(10, 20);
	}
}
