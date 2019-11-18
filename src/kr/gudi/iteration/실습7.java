package kr.gudi.iteration;

import java.util.Scanner;

public class 실습7 {
	
	static int 행;

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		시작(new Scanner(System.in));
	}
	
	static void 시작(Scanner scan) {
		while(true) {
			System.out.println("구구단 출력 행 수 입력하세요.");
			행 = scan.nextInt();
			if(행 == 0) {
				break;
			}
			구구단();
			System.out.println("------------------------------");
		}
		scan.close();
	}
	
	static void 구구단() {
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
