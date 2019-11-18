package kr.gudi.iteration;

import java.util.Scanner;

public class 실습7 {
	
	static int 행;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		행 = scan.nextInt();
		
		for(int 단 = 1; 단 < 10 ; 단 += 행) {
			수(단);
		}
		
	}
	
	static void 수(int 단) {
		for(int 수 = 1; 수 < 10; 수++) {
			출력(단, 수);	
		}
	}
	
	static void 출력(int 단, int 수) {
		for(int 열 = 0; 열 < 행; 열++) {
			System.out.print((단 + 열) + " * " + 수 + " = " + ((단 + 열) * 수) + "\t");
		}
		System.out.println("");
	}

}
