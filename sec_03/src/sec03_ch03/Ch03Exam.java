package sec03_ch03;

public class Ch03Exam {

	public static void main(String[] args) {
		int x = -100;
		int rs = +x;
		int rs2 = -x;
		
		System.out.println(rs);
		System.out.println(rs2);
		
		short s = 100;
		//short rs3 =-s; //컴파일 에러
		int rs3 = -s;
		System.out.println(rs3);
		
		int a = 1;
		int b = 1;
		int result = ++a + 10;
		int result2 = b++ +10;
		
		System.out.println(result); // 2 + 10
		System.out.println(result2); // 1 + 10
		System.out.println(b); // 2
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		

	}

}
