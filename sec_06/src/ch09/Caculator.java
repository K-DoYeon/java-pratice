package ch09;

public class Caculator {
	
	// 정적 필드 선언
	
	static double pi = 3.141592;
	
	/*
	 * 클래스내에 같은 이름의 생성자를 여러 개 선언한 생성자 오버로딩과 같이 매소드 역시 같은 이름의 매소드를 여러개 생성하는 매소드 Overloading이 가능하다.
	 * 하나의 매소드 이름으로 다양한 매개값을 받기 위해 사용한다.
	 * 조건은 매개변수의 타입, 개수, 순서 등이 달라야 한다.
	 * */
	
	// 정사각형
	double areaRect(double width) {
		return width * width;
	}
	
	// 직사각형
	double areaRect(double width, double height) {
		return width * height;
	}
}
