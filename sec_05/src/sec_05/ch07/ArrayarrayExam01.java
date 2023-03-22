package sec_05.ch07;

public class ArrayarrayExam01 {

	public static void main(String[] args) {
//		String [][] names = {
//				{"홍길동","신용권","김자바"},
//				{"이나영","김혜수","이수지"}
//		};
//		
//		System.out.println(names[0][1]);
//		System.out.println(names[1][2]);
		
		int[][] mathScores = new int[2][3];
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}

		System.out.println();
		
		int[][] mathScores2 = new int[2][];
		mathScores2[0] = new int[2];
		mathScores2[1] = new int[3];
		
		for(int i = 0; i < mathScores2.length; i++) {
			for(int j = 0; j < mathScores2[i].length; j++) {
				System.out.println("mathScores2[" + i + "][" + j + "] = " + mathScores2[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] mathScores3 = {{95,88},{99,72,56}};
		
		for(int i = 0; i < mathScores3.length; i++) {
			for(int j = 0; j < mathScores3[i].length; j++) {
				System.out.println("mathScores3[" + i + "][" + j + "] = " + mathScores3[i][j]);
			}
		}
		
		// 기본 타입 배열들은 각 항목들이 직접 값을 가지게 되고
		// 참조 타입 배열들은 각 항목들이 번지를 가지고 있는다.
		

	}

}
