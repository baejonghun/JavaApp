package kr.gudi.iteration;

public class 실습14 {

	public static void main(String[] args) {
		
		String[] 배열1 = new String[9];
		String[] 배열2 = {"O","X","O","X","O","X","O","X","O"};
		
		배열1[0] = "O";
		배열1[1] = "O";
		배열1[2] = "O";
		배열1[3] = "O";
		배열1[4] = "O";
		배열1[5] = "O";
		배열1[6] = "O";
		배열1[7] = "O";
		배열1[8] = "O";
		
//		배열2[0] = "O";
//		배열2[1] = "X";
//		배열2[2] = "O";
//		배열2[3] = "X";
//		배열2[4] = "O";
//		배열2[5] = "X";
//		배열2[6] = "O";
//		배열2[7] = "X";
//		배열2[8] = "O";
		
		for(int j = 0; j < 9; j++) {
			for(int i = 0; i < 9; i++) {
				if(j%2 == 0) {
					System.out.print(배열1[i]);
				} else {
					System.out.print(배열2[i]);
				}
			}
			System.out.println("");
		}

	}

}
