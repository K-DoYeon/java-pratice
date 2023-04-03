package Test0327;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrA = {0,0,0,0,0,0,0,0,1,0};
		int[] arrB = {0,0,0,0,0,0,0,0,1,1};
		int[] arrS;
		arrS = new int[10];
		
		int c = 0;
		int h = 0;
		
		for(int i = 9; i >= 0; i++) {
			h = arrA[i] + arrB[i] + c;
			
			if(h < 2) {
				c = 0;
				arrS[i] = h;
			}else {
				c = 1;
				arrS[i] = h - 2;
			}
		}
		
		

	}

}
