package sec01.exam09;

public class ResourcePathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.png").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
class Car {}