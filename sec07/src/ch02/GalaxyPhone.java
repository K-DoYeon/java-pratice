package ch02;

public class GalaxyPhone extends CellPhone{
	
	// 필드
	Boolean pen;
	
	//생성자
	GalaxyPhone(String model, String color, Boolean pen){
		this.model = model;
		this.color = color;
		this.pen = pen;
	}
	
	// 메소드
	void turnonPen() {
		System.out.println("갤럭시 " + model + "의 펜을 꺼냅니다.");
	}
	void drawPen() {
		System.out.println("갤럭시 " + model + "에 그림을 그립니다.");
	}
	void turnoffPen() {
		System.out.println("그리기를 중단하고 펜을 " + model + "에 넣습니다.");
	}
	void lost() {
		System.out.println("펜을 잃어버렸습니다.");
	}
	

}
