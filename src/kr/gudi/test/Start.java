package kr.gudi.test;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		A a = new A(new ArrayList());
		List list = a.getList();
		a.setList("연습");
		System.out.println(list.get(0));
	}

}
