package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Duck duck = new Duck();
		dog.sound();
		cat.sound();
		duck.sound();
		
		//변수의 자동타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		animal = new Duck();
		animal.sound();
		
		//메소드의 다형성.
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Duck());

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}


// animalSound 함수를 왜 static 으로 만들어야 하나????