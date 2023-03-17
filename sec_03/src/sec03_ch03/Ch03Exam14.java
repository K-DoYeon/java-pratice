package sec03_ch03;

public class Ch03Exam14 {

	public static void main(String[] args) {
		// 3항 연산을 이용하여 90이상 A 80미만 B 70이하 C int score = 75;
		//(조건식) ? 참 : (조건식) ? 참 : 거짓

		int score = 75;
		
		String rs = (score >= 90) ? "A" : (score < 90 && score >= 80) ? "B" : "C";
		
		System.out.println(rs);
		
		//1.3 2.31 3.가 
		int pencils = 534;
		int st = 30;
		
		int pps = pencils / st;
		System.out.println(pps); //17
		
		int pl = pencils % st;
		System.out.println(pl); //24
		
		//5
		int value = 356;
		System.out.println(value - (value % 100));
		System.out.println((value/100)*100);
		
		//6
		int lgT = 5;
		int lgB = 10;
		int h = 7;
		double area = (double)(lgT + lgB)/2 * h;
		System.out.println(area); //52.5
		
		//7 true, false
		//8 Double.isNaN(z);
	}

}
