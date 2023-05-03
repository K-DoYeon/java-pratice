package ch15;

import java.lang.reflect.Method; // 동적으로 실행할 때 클래스의 정보를 조사 reflect

public class ServiceExam {

	public static void main(String[] args) {
		
		// 서비스의 몇 개의 메소드가 있는지 조사한다.
		Method[] declaredMedthods = Service.class.getDeclaredMethods();

		
		for(Method method : declaredMedthods) { // 향산된 for 문 - 옛날 for 문 for(int i = 0; i < declaredMedthods.length; i++)
			// System.out.println(method.getName()); // 메소드 이름 출력
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				// System.out.println(method.getName());
				PrintAnnotation printannotation = method.getAnnotation(PrintAnnotation.class);
//				System.out.println(method.getName() + ": ");
//				System.out.println("value : " + printannotation.value());
//				System.out.println("number : " + printannotation.number());
				
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				// 구분선 출력
				for (int i = 0; i < printannotation.number(); i++) {
					System.out.print(printannotation.value());
				}
				System.out.println();
				
				// 메소드 호출 -- 예외처리 해야 함
				try {
					method.invoke(new Service());
				}catch(Exception e) {}
				System.out.println();
			}
		}
		
	}

}
