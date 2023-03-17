package sec04_ch02;

import java.util.Scanner;

public class If_exam02 {

	public static void main(String[] args) {
		// 키보드의 점수를 입력 받아 A,B,C,D,F 등급으로 나누어 출력하는 class를 작성하라
		
		Scanner score = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = score.nextInt();
		
		/*if(num >= 90) {
			System.out.println("A입니다.");
		}else if(num < 90 && num >= 80) {
			System.out.println("B입니다.");
		}else if(num < 80 && num >= 70) {
			System.out.println("C입니다.");
		}else if(num < 70 && num >= 60) {
			System.out.println("D입니다.");
		}else {
			System.out.println("F입니다.");
		}*/
		
		if(num < 60) {
			System.out.println("F입니다.");
		}else if(num < 70) {
			System.out.println("D입니다.");
		}else if(num < 80) {
			System.out.println("C입니다.");
		}else if(num < 90) {
			System.out.println("B입니다.");
		}else {
			if(num >= 95) {
				System.out.println("A+입니다.");
			}else {
				System.out.println("A입니다.");
			}
			
		}

	}

}
