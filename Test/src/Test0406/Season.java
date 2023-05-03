package Test0406;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// 6. 12, 1, 2 - 겨울,  3,4,5 - 봄  6,7,8 - 여름  9,10,11 - 가을을 출력하는 printSeason이라는 메서드를 만들고 숫자를 입력받아 계절을 출력하라.
		
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("멸 월 입니까? (1~12)");
			month = sc.nextInt();
		}while(month < 1 || month > 12); // 범위 안에 있는 수만 인정 받을 수 있게 하는 do while문
		
		printSeason(month);

	}
	
	static void printSeason(int m) {
		switch(m) {
		
		case 12: case 1: case 2: System.out.println("겨울"); break;
		case 3: case 4: case 5: System.out.println("봄"); break;
		case 6: case 7: case 8: System.out.println("여름"); break;
		case 9: case 10: case 11: System.out.println("가을"); break;
		}
	}

}
