package kr.gudi.test;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> map 
			= new HashMap<String, Integer>();
		System.out.println(map);
		map.put("0", 5);
		map.put("1", 3);
		map.put("2", 0);
		
		Test2 t2 = new Test2();
		t2.입력(map);

		
		Test1 t1 = new Test1();
		t1.실행(t2);
		t2.출력();
	}

}
