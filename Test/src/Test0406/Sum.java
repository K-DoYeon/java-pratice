package Test0406;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 4. 1부터 n까지의 정수의 합을 구해서 반환하는 메서드를 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int a;
		do {
			System.out.println("n의 수를 입력하세요");
			a = sc.nextInt();
		}while(a <= 0);
		
		System.out.println("결과는 : " + sumB(a));
	}
	
	static int sumB(int n) {
		int sum = 0; // 합이 들어갈 변수
		
		for(int i = 1; i <= n; i++) {
			sum += i; // sum에 i를 계속 더함.
		}
		return sum; // 더한 결과를 return
		
	}

}
