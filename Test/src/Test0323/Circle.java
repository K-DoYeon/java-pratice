package Test0323;

public class Circle {
	
	static double radius = 7.5;

	public static void main(String[] args) {
		// 1. 아래와 같은 조건의 원이 있다. 이 원의 면적과 둘레를 출력하는 java 프로그램을 작성하라. (반지름 7.5)
		// 원의 둘레 : 반지름 * 2 * 3.14 원의 넓이 : 반지름 * 반지름 * 3.14
		
//		double Circle = 7.5;
//		double a = Circle * 2 * 3.14;
//		double b = Circle * Circle * 3.14;
//		
//		System.out.println("원의 둘레는 : " + a);
//		System.out.println("원의 넓이는 : " + b);
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("원 둘레는 : " + perimeter);
		System.out.println("면적은 : " + area);

	}

}
