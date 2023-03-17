package sec03_ch03;

public class Ch03Exam04 {

	public static void main(String[] args) {
		//런타임시 입력된 값을 계상하여야 할 경우 - 산술 연산자를 직접 사용하는 것 보다는 메소드를 작성하여 오버플로우를 미리 조사하고 예외처리를 한다.
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 계산식을 종료합니다.");
		}

	}
	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}
