package Test0421;

public class Person {
	// 1. 이름과 나이 속성을 가진 Person 클래스 만든 후 실행 클래스를 만들어 이름과 나이를 출력
//	String name;
//	int age;
	
	private String name;
	private int age;
	

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}



	public static void main(String[] args) {
		
//		Person person = new Person("홍길동", 500);
//		
//		System.out.println("이름 : " + person.name);
//		System.out.println("나이 : " + person.age);
		
		Person person1 = new Person("홍길동", 500);
		Person person2 = new Person("김철수", 300);
		
		System.out.println(person1.getName() + "은 " + person1.getAge() + "살 입니다.");
		System.out.println(person2.getName() + "은 " + person2.getAge() + "살 입니다.");
		
	}
	
}
