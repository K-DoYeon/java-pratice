package ch09;

public class CaculatorExam {

	public static void main(String[] args) {
		
		double rs3 = 10 * 10 * Caculator.pi;
		
		System.out.println("rs3 : " + rs3);
		
		Caculator myCal = new Caculator();
		
		// 정사각형 넓이
		
		double rs1 = myCal.areaRect(15);
		
		double rs2 = myCal.areaRect(18, 22);
		
		System.out.println("정사각형 넓이 : " + rs1);
		System.out.println("직사각형 넓이 : " + rs2);
		
		

	}

}
