package ch03;

public class VariableScopeExam {

	public static void main(String[] args) {
		int v1 = 5;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 +5; scope안에 있는 변수는 scope안에서만 사용가능

		System.out.println(); 
		//시스템으로 출력하는데 
		/*
		 * 1. println(내용) -> 괄호안의 내용을 출력하고 행을 바꿔라.
		 * 2. print -> 행일 바꾸지 않고 출력.
		 * 3. printf("형식문자열 ", 값1, 값2...);
		 * 
		 * % [argument_index$] [flags] [width] [.percision] conversion
		 * argument_index$ 일련번호
		 * flags -,0
		 * width 전체 자리수
		 * .percision 소수점 자리수
		 * conversion 변환문자 String = s, Number = d
		 * */
		
		System.out.printf("이름 : %1$-6s, 나이 : %2$d", "홍길동", 25);
		//System.out.printf("나이 : %d", 25);
	}

}
