package sec02;

public class Var3 {
	
	public static void main(String[] args) {
		//0b1011, 0206, 365, 0xb3
		/*2진수는 앞에 0b, 0B
		  8진수는 앞에 0
		  16진수는 앞에 0x, 0X
		  long 타입을 선언할때 int의 한도를 넘는 수는 뒤에 l,L을 붙인다.
		*/
		
		int a = 0b1011; //2진수
		int b = 0206; //8진수
		int c = 365; //10진수
		int d = 0xb3; //16진수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		long num = 20;
		long num2 = 30000000L;
		System.out.println(num + " " + num2);
		
		char c1 = 'A';
		char c2 = 65;
		
		char c3 = '가';
		char c4 = 44032;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
