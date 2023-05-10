package sec09.ch03;

public class A {
//	// 필드
//	int field1;
//	
//	// 메소드
//	void method1() {}
//	
//	// 정적 필드, 메소드
//	static int field2;
//	static void method2() {}
//	
//	// 인스턴스 멤버 클래스
//	class B {
//		
//		void method() {
//			// A의 인스턴스 필드 메소드 사용
//			field1 = 10;
//			method1();
//			
//			// A의 정적 필드 메소드 사용
//			field2 = 20;
//			method2();
//		}
//		
//	}
	
	// A의 필드와 메소드
	String field = "A-field";
	void method( ) {
		System.out.println("A-method");
	}
	
	class B{
		// B 필드와 메소드
		String field = "B-field";
		void method() {
			System.out.println("B-method");
		}
		// B객체 필드 메소드 사용
		void print() {
			System.out.println(this.field);
			this.method();
			
			// A 객체 필드 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
		}
	
	}
	
	// A 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
