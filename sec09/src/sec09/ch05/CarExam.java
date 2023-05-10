package sec09.ch05;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		// 익명 자식 객체가 대입된 필드 사용
		car.run1();
		
		// 익명 자식 객체가 대입된 로컬 변수 사용
		car.run2();
		
		// 익명 자식 객체가 대입된 매개변수 
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("정말 많이도 굴러갑니다~~~");
			}
		});

	}

}
// 익명 구현 객체 - 안드로이드와 같은 UI프로그램에서 이벤트 처리하는 객체로 많이 사용됨
// 익명 구현 객체가 가져야 할 멤버 필드, 메소드는 중괄호 블록 안에서만 사용가능
