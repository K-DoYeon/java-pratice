package sec_05.ch06;

public class Arravg {

	public static void main(String[] args) {
		int[] scores = {80, 90, 100};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = (double)sum / 3;
		
		if(avg >= 90) {
			System.out.println("A");
		}else {
			System.out.println("탈락");
		}
	}

}
