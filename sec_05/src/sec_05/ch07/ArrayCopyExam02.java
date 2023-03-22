package sec_05.ch07;

public class ArrayCopyExam02 {

	public static void main(String[] args) {
		// system.arraycopy(이전배열, 이전배열복사위치, 새로운배열, 새로운배열 붙여넣기 위치, 복사할 갯수);
		
		String [] oldstr = {"java","html","css"};
		String [] newstr = new String[6];
		
		System.arraycopy(oldstr, 0, newstr, 0, oldstr.length);

		for(int i = 0; i < newstr.length; i++) {
			System.out.print(newstr[i] + ", ");
		}
	}

}
