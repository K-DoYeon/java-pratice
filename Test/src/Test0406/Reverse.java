package Test0406;

import java.util.Scanner;

public class Reverse {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 9. 양의 정수값을 거꾸로 반환하는 readPlustInt 메서드를 작성하라. 단, 음수값이 들어올 경우  재입력하도록 할 것.
		
		int x = 0;
		do {
			int n = readPlusInt();
			System.out.print("반대로 읽으면");
			
			while(n > 0) {
				System.out.print(n % 10); // n의 마지막 자리수
				n /= 10;
			}
			System.out.print("입니다");
			
		}while(x == 1);

	}
	
	static int readPlusInt() {
		int x;
		do {
			System.out.println("양의 정수값");
			x = sc.nextInt();
		}while(x <= 0);
		return x;
	}

}
