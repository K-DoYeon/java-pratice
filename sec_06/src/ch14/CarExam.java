package ch14;

public class CarExam {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		// 잘못 속도 변경
		mycar.setSpeed(-50);
		System.out.println("현재 속도 : " + mycar.getSpeed());
		
		// 올바른 속도
		mycar.setSpeed(100);
		
		System.out.println("현재 속도 : " + mycar.getSpeed());
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		

	}

}
