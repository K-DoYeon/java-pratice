package ch13.package1;

public class A {	
	
	// 필드
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자");
	
	// 생성자
	public A(boolean b) {} //public 외부 내부 패키지 다 가능
	A(){} // default 외부 패키지 불가능
	private A(String s) {} // private 외부 내부 패키지 둘다 불가능

}
