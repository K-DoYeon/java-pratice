package ch08;

public class Calculator {
	// 필드
	String color;
	String type;
	
	public Calculator(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	// 매소드
	void poweron(){
		System.out.println("전원을 켭니다.");
	}
	
	double divide(int x , int y) {
		double rs = (double)x / (double) y;
		return rs;
	}
	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	
}
