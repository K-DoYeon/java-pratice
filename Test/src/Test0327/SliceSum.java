package Test0327;

import java.util.Scanner;

public class SliceSum {

	public static void main(String[] args) {
		// 3. 0보다 크고 1000보다 작거나 같은 임의의 정수를 입력하면 각각의 정수를 모두 더하여 출력하라. (Scanner  이용)
		// 예) 565 => 5 + 6 + 5 => 16출력
		
		Scanner num = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num2 = num.nextInt();
		int rs = 0;
		
//		if(num2 >= 0 && num2 <= 1000) {
//			String a = Integer.toString(num2);
//			
//			for(int i = 0; i < a.length(); i++) {
//				rs += Integer.parseInt(a.substring(i,i+1));
//			}
//			
//		}else {
//			System.out.println("범위를 초과하였습니다.");
//		}
//		
//		System.out.println(rs);
		
		//1) 10으로 나눠서 나머지를 구함
		int f = num2 % 10;
		int nf = num2 / 10;
		int s = nf % 10;
		nf = nf / 10;
		int th = nf % 10;
		nf = nf / 10;
		int fo = nf % 10;
		int sum = th + s + f + fo;
		System.out.println(sum);

	}

}
