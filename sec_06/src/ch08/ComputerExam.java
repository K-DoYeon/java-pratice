package ch08;

public class ComputerExam {

	public static void main(String[] args) {
		
			// 
			Computer rs = new Computer();
			int[] val = {1,2,3};
			int rs2 = rs.sum1(val);
			
			System.out.println("rs2 : " + rs2);
			
			int rs3 = rs.sum1(new int[] { 1, 2, 3});
			System.out.println(rs3);
			
			int rs4 = rs.sum2(1,4,6,7,11);
			System.out.println(rs4);

		

	}

}
