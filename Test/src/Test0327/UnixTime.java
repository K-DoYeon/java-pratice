package Test0327;

import java.time.Instant;

public class UnixTime {

	public static void main(String[] args) {
		// 4.unix 타임을 구하는 자바 수식은 Instant.now().getEpochSecond(); 이다. 이 값을 이용해 유닉스 타임초를 받은 후 오늘 까지 몇년 몇일이 지났는지 계산하라.
		
		long a = Instant.now().getEpochSecond();
		
		long year = a / (365 * 24 * 60 * 60);
		long day = (int)(a / 60 / 60 / 24) % 365;
		
		System.out.println(year + "년" + day + "일 지났습니다.");

	}

}
