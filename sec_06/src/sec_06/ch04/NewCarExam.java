package sec_06.ch04;

public class NewCarExam {

	public static void main(String[] args) {
		// Car 객체를 생성
		NewCar myCar = new NewCar();
		//myCar.method;
		
		// NewCar의 필드값을 읽어 보자
		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동 여부 : " + myCar.start);
		System.out.println("현재 속도 : " + myCar.speed);
		
		//myCar.model = "현대자동차";

	}

}
