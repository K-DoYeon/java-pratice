package sec04_ch02;

public class Random2 {

	public static void main(String[] args) {
		// 주사위 게임
		
				int num = (int)(Math.random()*6)+1; //강제 타입변환을 해야함.
				
				switch(num) {
					case 1:
						System.out.println("1이 나왔습니다.");
					break;
					case 2:
						System.out.println("2이 나왔습니다.");
					break;
					case 3:
						System.out.println("3이 나왔습니다.");
					break;
					case 4:
						System.out.println("4이 나왔습니다.");
					break;
					case 5:
						System.out.println("5이 나왔습니다.");
					break;
					case 6:
						System.out.println("6이 나왔습니다.");
					break;
				}
		

	}

}
