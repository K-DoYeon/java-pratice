package ch04;

public class SuperSonicAirplane extends Airplan{
	
	//필드
	// 상수 static final - 는 정적 파이널로 선언함.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	// 부모의 메소드 fly()를 오버라이드해서 바꿈
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			// 오버라이드 하기 전의 부모의 fly()를 실행시킴
			super.fly();
		}
		
	}
	
	// 오버로드 : 메서드 오버로드는 m이란 메소드가 있을 때 여러개로 만들 수있들때
	// 오버라이딩 : 안에 있는 내용을 자식객체에서 다른거로 바꿔쓰는 것

}
