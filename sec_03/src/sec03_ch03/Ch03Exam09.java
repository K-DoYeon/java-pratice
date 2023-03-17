package sec03_ch03;
import java.util.*;

public class Ch03Exam09 {
	
	//NaN or Infinity = double type

	public static void main(String[] args) {
		double dmoney = 1000000.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력하세요.");
		String InputData = scanner.nextLine();
		
		double newmoney = Double.valueOf(InputData);
		
		if(Double.isNaN(newmoney)) {
			System.out.println("NaN이 입력되어 처리가 불가능 합니다.");
			newmoney = 0.0;
		}
		
		double totalmoney = dmoney + newmoney;
		System.out.println(newmoney + "를 입금하셨습니다.");
		System.out.println("현재 통장 잔고는 " + totalmoney + "입니다.");
		
	}

}
