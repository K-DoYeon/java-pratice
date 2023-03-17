package sec03_ch03;
import java.util.*;


public class Ch03Exam10 {

	public static void main(String[] args) {
		
		//char 타입 입력을 받아 char가 소문자인지 조사하는
	
		Scanner scanner = new Scanner(System.in); //입력 받는 부분
		System.out.println("입력해주세요");
		String InputData = scanner.nextLine(); //입력을 받아 String 타입변수를 InputData로 받음
		char var = InputData.charAt(0); //저장된 string타입을 char타입 변환
		String txt;
		if(var >= 65 && var <= 90) {
			txt = "대문자";
		}else if(var >= 97 && var <= 122) {
			txt = "소문자";
		}else if(!(var < 48) && !(var > 57)) {
			txt = "숫자";
		}else {
			txt = "알파벳이나 숫자가 아닙니다.";
		}
		System.out.println("입력한 문자는" + txt + "입니다.");

	}

}
