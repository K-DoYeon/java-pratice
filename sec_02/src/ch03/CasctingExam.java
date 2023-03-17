package ch03;

public class CasctingExam {

	public static void main(String[] args) {
		/*
		 * byte A = 1, byte B = 2 했을때 A + B는 int타입으로 됨
		 * long longValue = 300 int intValue = (int) longValue;
		 *
		 * */
		int intValue = 103029770;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue); //10
		
		intValue = 65;
		char charValue = (char) intValue;
		System.out.println(charValue); //A
		
		//실수 -> 정수 
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); //3
		
		
		//리터럴/ 자바가 성능향상을 위해 컴파일 단계에서 리터럴 계산식은 미리 수행한다.
		byte result = 10 + 30;
		System.out.println(result);
		
		/*
		 * byte + byte , char * char, short * shor, int % int ->정수형 계산식은 정수형의 기본형인 int로 저장된다.
		 * */
		byte x = 1;
		byte y = 2;
		//byte c = x + y ->컴파일 에러
		int c = x + y;
		System.out.println(c);
		
		float rs = 1.2f + 3.4f; //float rs = 4.6f;
		double rs2 = 1.2f + 3.4; //double rs2
		//int intValue = 10; double doubleValue = 5.5; double result = intValue + doubleValue; -> int result = intValue + (int) doubleValue;
		
		int a = 1;
		int b = 2;
		//double rss = a / b; //0.0
		double rss = a / (double) y; //둘다 or 둘 중에 하나만 double //0.5
		System.out.println(rss);
		

	}

}
