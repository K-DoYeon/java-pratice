package ch03;

public class PrintExam {

	public static void main(String[] args) {
		int val = 123;
		System.out.printf("상품의 가격:%d원\n", val); //123원
		System.out.printf("상품의 가격:%6d원\n", val); //   123원
		System.out.printf("상품의 가격:%-6d원\n", val); //123   원
		System.out.printf("상품의 가격:%06d원\n", val); //000123원
		
		//정수는 d 실수는 f
		double area = 10*10*3.14159 ;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f", 10 , area);
		
		String name = "홍길동";
		String job = "도둑";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
