package sec03_ch03;

public class Ch03Exam07 {

	public static void main(String[] args) {
		//int num = 5;
		//double rs = num / 0.0;
		//System.out.println(rs); //int의 경우 ArithmeticException error, double은 infinity, nan
		
		//double rs2 = num % 0.0;
		//System.out.println(rs2); //ArithmeticException error
		
		int x= 5;
		double y = 0.0;
		double z = x / y;
		
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		if (Double.isFinite(z) || Double.isNaN(z)){
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z + 2);
		}
		
	}

}
