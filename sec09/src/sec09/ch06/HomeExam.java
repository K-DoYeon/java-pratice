package sec09.ch06;

public class HomeExam {

	public static void main(String[] args) {
		Home home = new Home();
		
		// 익명 구현 객체 필드
		home.use1();
		
		// 익명 구현 객체 로컬 변수
		home.use2();
		
		// 익명 구현 객체 매게변수
		home.use3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("가스를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("가스를 켭니다.");
			} 
		});

	}

}
