package Test0406;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// 7. c를 n개 표시하는 putChar 메서드와 이 메서드를 내부에서 호출해서 문자 '*'를 n개 연속으로 표시하는 putStars 메서드를 작성하라. 또, 이 메서드를 사용해서 직각삼각형을 만드는 프로그램을 작성하라
		
		Scanner sc = new Scanner(System.in);
		System.out.println("직각 삼각형");
		System.out.println("단수를 입력하세요");
		
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			putStars(i);
			System.out.println();
		}

	}
	
	// 문자 c를 n개 표시하는 메서드
	
	static void putChar(char c, int n) {
		while(n --> 0) {
			System.out.print(c);
		}
	}
	
	public static void putStars(int n) {
		putChar('*',n);
	}

}
