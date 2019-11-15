package kr.gudi.iteration;

public class 실습4 {

	public static void main(String[] args) {
		
		// 배열 생성
		int[] 정수배열 = new int[10]; 
		int[] 임시배열 = new int[10];
		
		// 정수배열 값 넣기
		for(int 위치값 = 0; 위치값 < 정수배열.length; 위치값++) {
			정수배열[위치값] = 위치값;
		}
		
		// 정수배열 연산식 후 임시배열에 값 넣기
		for(int 위치값 = 0; 위치값 < 정수배열.length; 위치값++) {
			int 결과값 = 정수배열[9 - 위치값] * 정수배열[위치값];
			임시배열[위치값] = 결과값;
		}
		
		// 임시배열의 내용을 정수배열에 옴기기
		정수배열 = 임시배열;
		
		// 정수배열 값 확인
		for(int 위치값 = 0; 위치값 < 정수배열.length; 위치값++) {
			System.out.println(정수배열[위치값]);
		}
		
	}

}
