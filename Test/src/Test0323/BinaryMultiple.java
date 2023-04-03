package Test0323;

import java.util.Scanner;

public class BinaryMultiple {

	public static void main(String[] args) {
		// 두 개의 이진수를 곱하는 java 프로그램을 작성하라. Scanner 이용 입력받을 것
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		int a = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("숫자2을 입력하세요");
		int b = num2.nextInt();
		
		int mutiple = a * b;
		String z = Integer.toBinaryString(mutiple);
		
		System.out.println("두 숫자의 곱의 이진수는 : " + z);
	}

}
