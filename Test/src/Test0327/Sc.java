package Test0327;

import java.util.Scanner;

public class Sc {

	public static void main(String[] args) {
		//5. Scanner를 이용하여 두 개의 정수를 받은 후 합, 차이, 곱, 평균, 큰수, 작은수를 표시하라.
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("숫자1을 입력하세요");
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("슛자2를 입력하세요");
		
		int a = num1.nextInt();
		int b = num2.nextInt();
		
		System.out.println("두 수의 합은 = " + (a + b));
		System.out.println("두 수의 차는 = " + (a - b));
		System.out.println("두 수의 곱은 = " + (a * b));
		System.out.println("두 수의 평균은 = " + (double)(a + b)/2);
		System.out.println("두 수의 큰 수는 = " + Math.max(a, b));
		System.out.println("두 수의 작은 수는 = " + Math.min(a, b));

	}

}
