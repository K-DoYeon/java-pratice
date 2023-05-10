package sec09.ch02;

public class A {
	// 인스턴스 멤버 클래스
	static class B{
		// 인트턴스 필드
		int field1 = 1;
		
		// 정적필드 (java 17부터 사용가능)
		static int field2 = 2;
		
		// 생성자
		B(){
			System.out.println("B-생성자 실행");
		}
		// 인스턴스 메소드
		void method1() {
			System.out.println("B-메소드1 실행");
		}
		
		// 정적 메소드(java 17부터 사용가능)
		static void method2() {
			System.out.println("B-메소드2 실행");
		}
		
	};
}
