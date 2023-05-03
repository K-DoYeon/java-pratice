package Test0421;

public class Circle {
	public static void main(String[] args) {
		// 반지름 속성이 있는 circle 클래스를 만들어 실행클래스에서 원의 넓이와 둘레를 구하시오
		
		double circle = 12.5;
		double a = Math.PI * circle * circle;
		double b = Math.PI * circle * 2;
		
		System.out.println("원의 넓이는 : " + a);
		System.out.println("원의 둘레는 : " + b);
		
		
	}
	
}
