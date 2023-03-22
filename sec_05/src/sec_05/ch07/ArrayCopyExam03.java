package sec_05.ch07;

public class ArrayCopyExam03 {

	public static void main(String[] args) {
		String[] strArr = {"길동", "순이", "석열"};
		String[] strAddArr = new String[5];
		
		//배열 항목 복사
//		for(int i = 0; i < strArr.length; i++) {
//			strAddArr[i] = strArr[i];
//		}
		System.arraycopy(strArr, 0, strAddArr, 0, strArr.length);
		
		for(int i = 0; i < strAddArr.length; i++) {
			System.out.print(strAddArr[i] + ", ");
		}

	}

}
