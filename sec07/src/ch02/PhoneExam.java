package ch02;

public class PhoneExam {

	public static void main(String[] args) {
		// GalaxPhone 객체 생성
		GalaxyPhone galaxyPhone = new GalaxyPhone("S22울트라", "핑크", false);
		
		// cellphone에서 상속받은 필드
		System.out.println("모델 : " + galaxyPhone.model);
		System.out.println("색상 : " + galaxyPhone.color);
		
		// cellPhone 에서 상속받은 메소드
		galaxyPhone.powerOn();
		galaxyPhone.bell();
		galaxyPhone.sendVoice("여보세요?");
		galaxyPhone.receviveVoice("안녕하세요 저는 홍길동 입니다. 그쪽의 물건을 이제부터 훔치겠습니다.");
		galaxyPhone.sendVoice("뭔소리야");
		galaxyPhone.hangUp();
		
		// galaxyPhone 필드 pen이 true 이면 galaxyPhone 메소드 호출
		if(galaxyPhone.pen) {
			galaxyPhone.turnonPen();
			galaxyPhone.drawPen();
			galaxyPhone.turnoffPen();
		}else {
			galaxyPhone.lost();
		}
	}

}
