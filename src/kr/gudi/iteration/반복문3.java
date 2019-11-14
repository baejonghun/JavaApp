package kr.gudi.iteration;

public class 반복문3 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while( i < 10 ) {
			i++;
			System.out.println("반복 > " + i);			
		}
		
		System.out.println("--------------------------");
		
		i = 0;
		for(;i < 10;) {
			i++;
			System.out.println(i);
		}
		
	}

}
