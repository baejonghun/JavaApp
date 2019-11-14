package kr.gudi.iteration;

public class 반복문2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i); // 0, 1, 2, 3
		}
		
		System.out.println("------------------------");

		for(int i = 0; i < 10; ++i) {
			System.out.println(i); // 1, 2, 3, 4
		} // i = i + 1;
		
		System.out.println("------------------------");
		
		for(int i = 0; i < 10; i += 2/*2씩  증가 : i = i + 2*/) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
	}

}
