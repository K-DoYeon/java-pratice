package sec02;

public class Var4 {
	
	public static void main(String[] args) {
		
		//정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("float: " + var1); //유효 소수점 자리가 7자리까지
		System.out.println("double: " + var2); //유효 소수점 자리가 15자리까지
		
		//숫자
		double var3 = 3e6; 
		float var4 = 3e6f;
		double var5 = 2e-3;
		//int var6 = 3e6; 에러 
		
		System.out.println("double: " + var3);
		System.out.println("float: " + var4);
		System.out.println("double: " + var5);
	}

}
