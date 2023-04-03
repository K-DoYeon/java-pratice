package Test0323;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// 2. 세 개의 숫자를 입력받아 숫자의 평균을 계산하고 출력하는 java 프로그램을 작성하라. (Scanner 이용 입력 받을 것)
		
		 Scanner num1 = new Scanner(System.in);
		 System.out.println("숫자1을 입력하세요");
		 int inputData = num1.nextInt();
		 
		 Scanner num2 = new Scanner(System.in);
		 System.out.println("숫자2를 입력하세요");
		 int inputData2 = num2.nextInt();
		 
		 Scanner num3 = new Scanner(System.in);
		 System.out.println("숫자3을 입력하세요");
		 int inputData3 = num3.nextInt();
		 
		 double rs = (double)(inputData +inputData2 + inputData3 )/3;
		 	 
		 System.out.println("평균은 : " + rs );

		 

	}

}
