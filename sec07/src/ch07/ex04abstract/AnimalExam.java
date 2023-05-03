package ch07.ex04abstract;

public class AnimalExam {
	
	// 자식 class는 부모 class를 선택할 수 있지만 부모 class 자식 class를 선택 할 수 없다
	// java15부터 public sealed class 부모 permits 자식1, 자식2

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		
		dog.sound();
		cat.sound();
		
		System.out.println("-------------------------------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
