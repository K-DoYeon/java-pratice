package Test0323;

public class Swith {

	public static void main(String[] args) {
		// 두 변수의 값을 서로 교환하는 java 프로그램을 작성하라.
		
		int num = 1;
		int num2 = 2;
		int temp = 0;
		
		temp = num;
		
		num = num2;
		num2 = temp;
		
		System.out.println(num);
		System.out.println(num2);

	}

}
