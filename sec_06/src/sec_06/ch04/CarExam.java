package sec_06.ch04;

public class CarExam {

	public static void main(String[] args) {
		Car Ev = new Car();
		
		Ev.sp();
		
		System.out.println("제작 회사 : " + Ev.company);
		System.out.println("모델명 : " + Ev.model);
		System.out.println("차량 색깔 : " + Ev.color);
		System.out.println("최고 속도 : " + Ev.maxSpeed);
		System.out.println("현재 속도 : " + Ev.speed);
	

	}

}
