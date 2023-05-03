package Test0406;

import java.util.Scanner;

public class SignOf {
	
	// 메소드
	static int signOf(int n) {
		int sign = 0;
		if(n > 0) {
			sign = 1;
		}else if(n < 0) {
			sign = -1;
		}
		return sign;
	}

	public static void main(String[] args) {
		// 1. signOf 라는 메서드를 만들어 입력한 int 형 정숫값이 음수이면 -1을 , 0이면 0을, 양수이면 1을 반환하는 실행 클래스를 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		int a = sc.nextInt();
		
		int b = signOf(a);
		System.out.println(b);
		

	}

}
