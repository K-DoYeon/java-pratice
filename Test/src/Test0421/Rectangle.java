package Test0421;

public class Rectangle {
	// 너비 높이 속성을 가진 Rectangle 클래스를 만들고 실행 클래스에서 면적(w*h)와 둘레(w+h)를 구하시오
//	int width;
//	int height;
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(50, 10);
		
		System.out.println("넓이는 " + rectangle.getArea());
		System.out.println("둘레는 " + rectangle.getPerimeter());
		
		System.out.println("면적 : " + rectangle.width * rectangle.height);
		System.out.println("둘레 : " + 2 * (rectangle.width + rectangle.height));
		
	}
	
}
