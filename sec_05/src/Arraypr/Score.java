package Arraypr;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // new int[5]
				
			}else if(selectNo == 2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
				
			}else if(selectNo == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
					
				}
				
			}else if(selectNo == 4) {
				
				int maxScore = 0;
				int totalScore = 0;
				for(int i = 0; i < studentNum; i++) {
					if(maxScore < scores[i]) {
						maxScore = scores[i];
					}
					totalScore += scores[i];
				}
				System.out.println("최고점수 : " + maxScore);
				System.out.println("평균점수 : " + (double)totalScore/scores.length);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
