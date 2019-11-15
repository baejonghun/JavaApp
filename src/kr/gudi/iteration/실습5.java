package kr.gudi.iteration;

public class 실습5 {

	public static void main(String[] args) {
		
		int[] x축 = {5,1,4,2,3,3,2,4,1,5};
		
		// {1,0,2,0,3,0,4,0,5,0};
		
		for(int i = 0; i < x축.length; i += 2) {
			int 임시 = x축[i];  // 0
			x축[i] = x축[i+1]; // 1
			x축[i+1] = 임시;
		}
		
		for(int i = 0; i < x축.length; i++) {
			System.out.println(x축[i]);
		}
	}

}
