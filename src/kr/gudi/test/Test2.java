package kr.gudi.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test2 {

	List<Map<String, Integer>> list 
			= new ArrayList<Map<String, Integer>>();
	
	void 입력(Map<String, Integer> i) {
		list.add(i);
	}
	
	void 출력() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	}
	
	void 수정(int i, Map<String, Integer> t) {
		list.set(i, t);
	}
	
	void 삭제(int i) {
		list.remove(i);
	}
	
}
