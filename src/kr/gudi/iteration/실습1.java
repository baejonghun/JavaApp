package kr.gudi.iteration;

public class 실습1 {

	public static void main(String[] args) {
		int 반복변수 = 0;
		for( ;true; ) {
			if(반복변수 >= 10) {
				break;
			}
			System.out.println(반복변수);
			반복변수 = 반복변수 + 1;
		}
		
		for(반복변수 = 0;반복변수 < 10; 반복변수 = 반복변수 + 1) {
			System.out.println(반복변수);
		}
		
	}

}
