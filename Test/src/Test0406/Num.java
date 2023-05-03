package Test0406;

import java.util.Random;
import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		// a<= 난수 <= b 인 난수를 생성하는 random 메서드를 작성하라. (b <= a 인 경우 그대로 a값을 반환할 것)
		// hint :  난수 라이브러리     java.util.Random;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("난수를 생성");
		System.out.println("하한값 : ");
		int min = sc.nextInt();
		System.out.println("상한값 : ");
		int max = sc.nextInt();
		
		System.out.println(random(min, max));
		

	}
	
	// a이상 b이하인 난수를 생성
	static int random(int a, int b) {
		if(b <= a) {
			return a;
		}else {
			Random rd = new Random();
			return a + rd.nextInt(b - a + 1);
		}
	}

}
