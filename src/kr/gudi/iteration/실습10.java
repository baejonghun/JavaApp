package kr.gudi.iteration;

public class 실습10 {

	public static void main(String[] args) {
		System.out.println("NO\t1234567890");
		for(int i = 1; i <= 11; i++) {
			System.out.print(i+"\t");
			for(int j = 1; j <= 10; j++) {
				if(i%2 == 0 && (j >= 2 && j <= 9)) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
			}
			System.out.println("");
		}
		
	}

}
