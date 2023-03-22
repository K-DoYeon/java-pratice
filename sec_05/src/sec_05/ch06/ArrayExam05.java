package sec_05.ch06;

public class ArrayExam05 {

	public static void main(String[] args) {
		
		int sum1 = add(new int[] {85, 88, 99, 77, 75});
		System.out.println(sum1);
		
		double avg = (double)sum1 / 5;
		System.out.println(avg);

	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
