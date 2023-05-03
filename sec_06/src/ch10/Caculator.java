package ch10;

public class Caculator {
	// 필드
		static double pi = 3.14159;
		String color;
		int size;
		
		static String calInfo;
//		static {
//			color = "빨강";
//			size = 25;
//			calInfo = color + size;
//		}
		
		// 메소드
		static int plus(int x, int y) {
			return x + y;
		}
		static int minus(int x, int y) {
			return x - y;
		}

}
