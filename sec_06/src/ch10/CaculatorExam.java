package ch10;


public class CaculatorExam {

	private char[] myCal;

	public static void main(String[] args) {
		
		String myCal = "공항굥 계산기";

		CaculatorExam c = new CaculatorExam();
		
		
//		Caculator myCal = new Caculator();
//		System.out.println(myCal.pi);
//		System.out.println(myCal.plus(20, 15));
//		System.out.println(myCal.minus(17, 13));
		
		//static이 붙어잇으면 선언하지 않고 바로 사용가능
		
		System.out.println(Caculator.pi);
		System.out.println(Caculator.plus(20, 15));
		System.out.println(Caculator.minus(17, 13));
		System.out.println(c.myCal);

	}

}
