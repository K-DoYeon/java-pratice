package ch07.ex03;

public class ChildExam {
	
	public static void methodA(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("methodA - Child로 변환 성공");
			child.field2 = "data";
			child.method1();
			child.method2();
			child.method3();
		}else { 
			System.out.println("타입변경이 불가능 합니다.");
		}
	}
	
	public static void methodB(Parent parent) {
		Child child = (Child) parent;
		System.out.println("methodB - Child로 변환 성공");
	}

	public static void main(String[] args) {
		
		
		Parent parent = new Child();
//		parent.method1();
//		parent.method2();
		
		methodA(parent);
		methodB(parent);
		
		Parent parent1 = new Parent();
		methodA(parent1);
		// methodB(parent1); // 예외
		
		// parent.fidle2 = "data";
		// parent.method3(); 부모타입으로 자식타입에 있는 건 불러 올 수 없다.
		
		Child child = (Child)parent;
		child.field2 = "data";
		child.method1();
		child.method2();
		child.method3();

	}

}
