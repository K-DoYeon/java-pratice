package sec02;

public class Var2 {

	public static void main(String[] args) {
		/*
		 * 리터럴 3,5를 대입하여 3시간 5분 출력
		 * 위 3시간 5분은 총 몇 분인지 출력
		 * */
		int time = 3;
		int min = 5;
		
		System.out.println(time + "시간 " + min + "분");
		
		int total = (time * 60) + min;
		
		System.out.println("총 시간은 " + total + "분");

		int num = 200;
		int num2 = 013; //8진법
		int num3 = 0xf; //16진법
		System.out.println(num3);
		
		
		
	}

}
