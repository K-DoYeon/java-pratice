package Test0406;

import java.util.Random;
import java.util.Scanner;

public class Rd {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 10. 다음 4개의 계산 문제 중 하나를 무작이로 출제하는 암산 훈련 프로그램을 작성하자. 이때 x, y, z에 3자리의 정숫값을 난수로 생성할 것.
		
		Random rd = new Random();
		
		do {
			int x = rd.nextInt(900) + 100; // 3자리수
			int y = rd.nextInt(900) + 100;
			int z = rd.nextInt(900) + 100;
			int pattern = rd.nextInt(4); // 패턴번호
			
			int answer;
			switch(pattern) {
			case 0 : answer = x + y + z; break;
			case 1 : answer = x + y - z; break;
			case 2 : answer = x - y + z; break;
			default : answer = x - y - z; break;
			}while(true) {
				System.out.println(
						x +
						((pattern < 2)? " + " : " - ") +
						y +
						((pattern % 2 == 0)? " + " : " - ") +
						z + " = "
						);
				
				int k = sc.nextInt(); // 입력한 답을 받음
				if(k == answer) {
					System.out.println("정답입니다.");
					break;
				}else {
					System.out.println("틀렸습니다.");
				}
			}
					
		}while(confirmRetry());
	}
	
	
	//계속할지 여부 확인하는 메소드
	
	static boolean confirmRetry() {
		int count;
		do {
			System.out.println("다시 하시겠습니까? <Y=>1 N=>0>");
			count = sc.nextInt();
		}while(count != 0 && count != 1);
		return count == 1;
	}

}
