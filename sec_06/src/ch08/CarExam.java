package ch08;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Car myCar = new Car();
				
				
				myCar.setGas(10); // gas 10을 주유 - Car의 setGas() 매소드 호출
				
				boolean isGas = myCar.isLeftGas(); // gas가 있는지 확인
				
				myCar.keyTurnOn();
				
				if(isGas) {
					System.out.println("출발합니다.");
					myCar.run(); // Car의 run() 호출해서 차량을 출발 시킨다.
				}
				
				if(!myCar.isLeftGas()) {
					System.out.println("gas를 주입해 주세요.");
				}

	}

}
