package sec_06.ch04;

public class Student {
	String name; // 이름
	String mobile; // 휴대폰 번호
	int absentSum; // 결석 누계
	int comeLateSum; // 지각 누계
	int leaveEarlySum; // 조퇴 누계
	
	// 결석하다.
	void absent() {
		absentSum += 1;
	}
	
	// 지각하다.
	void comeLate() {
		comeLateSum += 1;
	}
	
	// 조퇴하다.
	void leaveEarly() {
		leaveEarlySum += 1;
	}

}
