package kr.gudi.test;

import java.util.Map;

public class Test1 {
	
	int add(int a, int b) {
		return (a + b);
	}
	
	void 실행(Test2 t2) {
		for(int i = 0; i < t2.list.size(); i++) {
			Map<String, Integer> map = t2.list.get(i);
			int result = add(map.get("0"), map.get("1"));
			System.out.println(result);
			map.replace("2", result);
		}
	}

}
