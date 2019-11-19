package kr.gudi.iteration;

public class 실습9 {

	public static void main(String[] args) {
		System.out.println("NO\t1234567890123456789");
		for(int i = 1; i < 20; i++) {
			System.out.print(i + "\t");
			for(int j = 1; j < 20; j++) {
				if(i <= 10 && j > (10 - i) && j < (10 + i)) {
					System.out.print("O");
				} else if(i > 10 && j > (i - 10) && j < 20 - (i - 10)) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
			}
			System.out.println("");			
		}
		
	}

}
