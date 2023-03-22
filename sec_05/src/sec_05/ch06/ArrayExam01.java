package sec_05.ch06;

public class ArrayExam01 {
	public static void main(String[] args) {
	
		int[] scores = {83, 90, 87};
		
		System.out.println("Score[0] : " + scores[0]);
		System.out.println("Score[1] : " + scores[1]);
		System.out.println("Score[2] : " + scores[2]);
		
		//scores의 총합과 평균을 구하라
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
		
	}

}
