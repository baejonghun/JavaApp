package kr.gudi.iteration;

import java.util.Scanner;

public class 실습16 {

	public static void main(String[] args) {
		
		int[][] 맵 = {
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
		
		int x = 0;
		int y = 1;

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < 맵.length; i++) {
				for(int j = 0; j < 맵[i].length; j++) {
					System.out.print(맵[i][j]);
				}
				System.out.println("");
			}
			System.out.println("");
			switch (scan.next()) {
				case "1": // 위쪽
					System.out.println("위쪽 이동!");
					if(맵[y - 1][x] == 1) {
						맵[y - 1][x] = 2;
						맵[y][x] = 1;
						y--;
					}
					break;
				case "2": // 오른쪽
					System.out.println("오른쪽 이동!");
					if(맵[y][x + 1] == 1) {
						맵[y][x + 1] = 2;
						맵[y][x] = 1;
						x++;
					}
					break;
				case "3": // 아래쪽
					System.out.println("아래쪽 이동!");
					if(맵[y + 1][x] == 1) {
						맵[y + 1][x] = 2;
						맵[y][x] = 1;
						y++;
					}
					break;
				case "4": // 왼쪽
					System.out.println("왼쪽 이동!");
					if(맵[y][x - 1] == 1) {
						맵[y][x - 1] = 2;
						맵[y][x] = 1;
						x--;
					}
					break;
				default:
					System.out.println("다시 입력하세요.");
					break;
			}
			
			scan.close();
			
		}
		
	}

}
