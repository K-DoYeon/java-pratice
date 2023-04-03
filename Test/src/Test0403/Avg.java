package Test0403;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// 2. 철수가 이번 시험을 망쳤다. 그래서 점수를 조작해 집에 가져가려고 한다. 일단 철수는 자기 점수중 최대값을 골랐다. 그런 다음 최댓값을 M이라 할 때 
		// 모든 점수를 점수/M*100 으로 고쳤다. 예를 들어 철수의 최고 점이 70점, 수학 점수가 50점이라면 고친 수학 점수는 50/70*100 이므로 73.43점이 된다.
		// 철수의 방법으로 성적을 계산했을 때 새로운 평균을 구하는 프로그램을 작성하라
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 과목수 선언
		
		int A [] = new int[N]; // 과목수 만큼 배역을 만듬
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i = 0; i < N; i++) {
			if(A[i] > max) max = A[i];
			sum = sum + A[i]; // 점수 총합
		}
		
		// 한 과목과 관련된 수식을 총합한 후 수식으로 변환
		System.out.println("원래 평균 : " + sum / N);
		System.out.println("고친 평균 : " + sum * 100.0 / max / N);
		

	}

}
