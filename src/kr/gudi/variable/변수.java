package kr.gudi.variable;

public class 변수 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 5;
//		int c = 0;
		
//		a = a + b;
//		a = a - b;
//		a = a * b;
//		a = a / b;
//		
//		a = a + b;
		a = 합계(a, b);
		System.out.println(a);
	}
	
	static int 합계(int a, int b) {
		return a + b;
	}

}
