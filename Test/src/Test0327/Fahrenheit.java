package Test0327;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// 1. 오늘의 온도를 화씨로 받아 섭씨로 변환하여 출력하라. (Scanner 이용)
		// hint:  섭씨 = (5(화씨-32)) / 9
		
		Scanner Fah = new Scanner(System.in);
		System.out.println("오늘의 화씨 온도를 입력하세요");
		double num = Fah.nextDouble();
		double c = ((5*(num - 32.0) / 9.0));
		System.out.println("오늘의 섭씨 온도는 : " + c + "°C 입니다.");
		
	}

}
