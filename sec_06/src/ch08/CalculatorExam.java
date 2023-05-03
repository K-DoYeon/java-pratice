package ch08;

public class CalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Calculator cal = new Calculator("파랑색", "코딩용");
//				cal.color = "파랑";
//				cal.type = "전문가용";
				
				System.out.println(cal.color + " " + cal.type + "계산기가 있습니다.");
				
				cal.poweron();
				
				byte x = 10;
				byte y = 4;
				
				double rs = cal.divide(x, y);
				
				System.out.println(x + "와 " + y + "를 나눕니다.");
				System.out.println("계산결과는 " + rs + "입니다.");
				
				cal.poweroff();

	}

}
