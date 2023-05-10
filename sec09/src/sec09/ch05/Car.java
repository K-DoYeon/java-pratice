package sec09.ch05;

public class Car {

	// 필드에 타이어 객체 대입
	private Tire tire1 = new Tire();
	
	// 필드에 익명 자식객체 대입
	private Tire tire2 = new Tire() {
		
	
	
		@Override
		public void roll() {
			System.out.println("익명 자식객체의 타이어 2가 굴러 갑니다.");
		}
	};
	
	// 메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
		
	}
	public void run2() {
		// 로컬 변수로 익명객체
		Tire tire = new Tire() {
			@Override
			public void roll(){
				System.out.println("익명 자식객체의 타이어 3가 굴러 갑니다.");
			
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
}
