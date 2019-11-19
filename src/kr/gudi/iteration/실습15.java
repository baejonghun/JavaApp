package kr.gudi.iteration;

public class 실습15 {

	public static void main(String[] args) {
		
		String[][] 맵 = {
				{"O","O","O","O","O","O","O","O","O"},
				{"O","X","O","X","O","X","O","X","O"},
				{"O","O","O","O","O","O","O","O","O"},
				{"O","X","O","X","O","X","O","X","O"},
				{"O","O","O","O","O","O","O","O","O"},
				{"O","X","O","X","O","X","O","X","O"},
				{"O","O","O","O","O","O","O","O","O"},
				{"O","X","O","X","O","X","O","X","O"},
				{"O","O","O","O","O","O","O","O","O"}
		};
		
		for(int i = 0; i < 맵.length; i++) {
			
			for(int j = 0; j < 맵[i].length; j++) {
				System.out.print(맵[i][j]);
			}
			System.out.println("");
		}
		
	}

}
