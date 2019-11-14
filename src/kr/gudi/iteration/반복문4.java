package kr.gudi.iteration;

public class 반복문4 {

	public static void main(String[] args) {
		
		int 입력값 = 4;
		
		// 구구단 (단 * 수 = 결과값) > 수 = 5 ( 1, 4, 7 ) 
		for(int 단 = 1; 단 < 10; 단 += 입력값) {
			
			for(int 수 = 1; 수 < 10; 수++) {
				String 행 = "";
				for(int 열 = 0; 열 < 입력값; 열++) {
					행 += (단 + 열) + " * " + 수 + " = " + ((단 + 열) * 수) + "\t";
				}
				System.out.println(행);
				
//				String a = (단 + 0) + " * " + 수 + " = " + ((단 + 0) * 수);
//				String b = (단 + 1) + " * " + 수 + " = " + ((단 + 1) * 수);
//				String c = (단 + 2) + " * " + 수 + " = " + ((단 + 2) * 수);
//				System.out.println(a + "\t" + b + "\t" + c);
			}
			
		}

	}

}
