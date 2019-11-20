package kr.gudi.iteration;

import java.util.Scanner;

public class 실습17 {
	
	static int[][] 맵 = {
			{0,0,0,0,0,0,0,0,0,0},
			{2,0,1,0,1,1,1,0,1,1},
			{1,0,1,0,1,1,1,0,1,1},
			{1,0,1,0,1,0,1,0,1,0},
			{1,1,1,0,1,0,1,0,1,0},
			{1,1,1,0,1,0,1,0,1,0},
			{1,0,1,0,1,0,1,0,1,0},
			{1,0,1,1,1,0,1,1,1,0},
			{1,0,1,1,1,0,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0}
	};
	static int[] 현재위치 = {1,0};

	public static void main(String[] args) {
		Scanner 입력 = new Scanner(System.in);
		맵그리기();
		while(true) {
			System.out.println("이동 방향을 입력하세요.");
			System.out.println("(1) 위쪽 (2) 오른쪽 (3) 아래쪽 (4) 왼쪽");
			System.out.print(">>>> ");
			int 상태코드 = 이동(입력.next());
			if(상태코드 == 1) {
				맵그리기();
			} else if(상태코드 == 0) {
				System.out.println("다시 입력하세요.");
			} else {
				System.out.println("프로그램 종료.");
				입력.close();
				break;
			}
		}
	}
	
	static void 맵그리기() {
		System.out.println("현재 상태");
		for(int 행 = 0; 행 < 맵.length; 행++) {
			for(int 열 = 0; 열 < 맵[행].length; 열++) {
				System.out.print(맵[행][열]);
			}
			System.out.println("");
		}
	}
	/*********************************************************
	 * 메소드명 : 이동
	 * 파라메터 : 입력받은 방향
	 * 방향	코드	설명
	 * 위쪽	1	맵의 배열에 행의 값을 1 감소 하여 이동한다. 
	 * 오른쪽	2	맵의 배열의 열의 값을 1 증가 하여 이동한다.
	 * 아래쪽	3	맵의 배열의 행의 값을 1 증가 하여 이동한다.
	 * 왼쪽	4	맵의 배열의 열의 값을 1 감소 하여 이동한다.
	 * 종료	0	입력을 더 이상 받지 않고 종료 한다.
	 * 경고	그외	맵은 다시 그리지 않고 입력 값만 다시 받는다.
	 *********************************************************/
	static int 이동(String 방향) {
		int 상태코드 = 1;
		int[] 변경위치 = 현재위치;
		switch (방향) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				상태코드 = -1;
				break;
			default:
				상태코드 = 0;
				break;
		}
		
		return 상태코드;
	}

}
