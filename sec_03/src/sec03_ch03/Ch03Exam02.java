package sec03_ch03;

public class Ch03Exam02 {

	public static void main(String[] args) {
		
		//비트 반전 연산자: ~(틸트) -> byte, short, int, long 타입만 피연산자가 될 수 있다. char(x) / 비트값을 반전(0->1, 1->0)시킨다.
		//			  : 부호 비트인 최상위 비트까지 반전되므로 부호의 반대값에 +1한 값이 산출된다. ex) byte v1 = 10; -> int v2 = ~v1; //-11
		
		int v1 = 10;
		int v2 = ~v1; //-11
		int v3 = ~v1 + 1; // -10
		System.out.println("십진수 : " + v1);
		System.out.println("십진수 : " + v2);
		System.out.println("십진수 : " + v3);
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v4) + "십진수 : " + v4);
		System.out.println(toBinaryString(v5) + "십진수 : " + v5);
		System.out.println(toBinaryString(v6) + "십진수 : " + v6);
		

	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value); //정수값을 32비트 이진 문자열로 리턴시키는 것
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
