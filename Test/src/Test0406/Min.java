package Test0406;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		// 2. 3개의 int형 인수 a, b, c를 받아 그 중 최솟값을 구하는 클래스를 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int b = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int c = sc2.nextInt();
		
		System.out.println("최소값은 : " + min(a,b,c));
		

	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}if(c < min) {
			min = c;
		}
		return min;
	}

}
