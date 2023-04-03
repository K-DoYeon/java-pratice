package Test0323;

public class Binary_Int {

	public static void main(String[] args) {
		// 2진수 100을 10진수로 변환하는 java 프로그램을 작성하라.
		
		int num = 4;
		
		String a = Integer.toBinaryString(num);
		
		int b = Integer.valueOf(a,2);
		
		System.out.println(b);

	}

}
