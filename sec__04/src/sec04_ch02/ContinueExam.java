package sec04_ch02;

public class ContinueExam {

	public static void main(String[] args) {
		// 1~100까지 중 짝수만 뽑아내는
		
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
