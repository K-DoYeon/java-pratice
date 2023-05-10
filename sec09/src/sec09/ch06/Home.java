package sec09.ch06;

public class Home {
	// 필드: 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("티브이를 켭니다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("티브이를 끕니다.");
		}
	};
	
	// 이용
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}

	public void use2() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
