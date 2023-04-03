package Test0323;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
	
		//10진수를 2진수로 변환하는 java 프로그램을 작성하라. Scanner 이용 입력 받을 것
		
		Scanner num = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int x = num.nextInt();
		
		String y = Integer.toBinaryString(x);
		System.out.println("숫자의 이진수는 : " + y);
		
		
	}
}
