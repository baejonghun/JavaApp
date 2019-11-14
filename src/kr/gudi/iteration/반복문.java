package kr.gudi.iteration;

public class 반복문 {

	public static void main(String[] args) {
		String a = "반복문";
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println(a);
			if("반복문".equals(a)) {
				break;
			}
			a = "변경";
		}
		/** break;
		 * i = 0 > a = "반복문" --> if문(false) > a = "변경"
		 * i = 1 > a = "변경"  --> if문(true) > for문 정지
		 * 
		 * continue;
		 * i = 0 > a = "반복문" --> if문(true) > 다음으로 실행
		 * i = 1 > a = "반복문" --> if문(true) > 다음으로 실행
		 * */		
		
	}

}
