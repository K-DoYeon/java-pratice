package sec03_ch03;

public class Ch03Exam11 {

	public static void main(String[] args) {
		//int value = 6; 2or3의 배수인가 조사

		int value = 6;
		String txt;
		
		if(value % 2 == 0) {
			txt = "2의 배수입니다.";
		}else if(value % 3 == 0) {
			txt = "3의 배수입니다.";
		}else {
			txt = "2의배수 3의배수가 아닙니다.";
		}
		
		System.out.println(txt);
		
		int a = 3;
		double b = 3.0;
		
		System.out.println(a == b);
		
		char c = 'A';
		int d = 65;
		System.out.println(c == d);
		System.out.println("************************");
		
		String st1 = "홍길동";
		String st2 = "홍길동";
		String st3 = new String("홍길동");
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		System.out.println(st1 == st2);
		System.out.println(st2 == st3);
		System.out.println(st1 == st3);
		
		System.out.println("************************");
		
		//문자열 조사하는 방식
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));
		
	}

}
