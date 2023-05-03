package Test0406;

import java.util.Scanner;

public class Middel {

	public static void main(String[] args) {
		// 3. 3개의 int형 인수 a, b, c,를 받아 그중 중간값을 구하는 클래스를 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int b = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int c = sc2.nextInt();
		
		System.out.println("중간값은 : " + md(a,b,c));

	}
	
	static int md(int a, int b, int c) {
		
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	

}
