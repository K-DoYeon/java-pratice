package sec03_ch03;

public class Ch03Exam08 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean rs1 = (num1 == num2);
		boolean rs2 = (num1 != num2);
		boolean rs3 = (num1 <= num2);
		
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		
		char c1 = 'A';
		char c2 = 'B';
		boolean rs4 = (c1 < c2);
		System.out.println(rs4);
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true

	}

}
