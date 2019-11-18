package kr.gudi.iteration;

public class 실습6 {

	public static void main(String[] args) {
		
		int[] 배열 = {8,3,4,6,2,7,5,1,9};
		// {1,2,3,4,5,6,7,8,9}
		
		for(int i = 0; i < (배열.length - 1); i++) {
			int m = i;
			for(int j = (i + 1); j < 배열.length; j++) {
				if(배열[m] > 배열[j]) {
					m = j;
				}
			}
			int 임시 = 배열[i];
			배열[i] = 배열[m];
			배열[m] = 임시;
		}
		
		for(int index = 0; index < 배열.length; index++) {
			System.out.println(배열[index]);
		}
		
	}

}
