package Test0327;

import java.util.Scanner;

public class Centimeter {

	public static void main(String[] args) {
		// 2. 인치 단위의 숫자를 일어 미터로 변환하여 출력하라. (Scanner 이용)
		
		Scanner cen = new Scanner(System.in);
		System.out.println("인치 숫자를 입력하시오.");
		double num = cen.nextDouble();
		double a = num / 39.37;
		
		System.out.println("인치 -> 미터 : " + a);

	}

}
