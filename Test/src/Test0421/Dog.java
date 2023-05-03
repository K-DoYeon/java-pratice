package Test0421;

public class Dog {
	// 이름과 품종 속성을 가진 Dog라는 클래스를 생성하고 getter,setter를 이용하여 실행 클래스에서 인스턴스를 만들고 출력하세요
	private String name;
	private String attribute;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.setName("푸들");
		dog.setAttribute("관종");
		
		System.out.println(dog.getName());
		System.out.println(dog.getAttribute());
		
	}

}
