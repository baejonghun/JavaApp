package kr.gudi.test;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		String[] s = new String[10];
		s[0] = "문자열 배열";
		System.out.println(s[0]);
		
		List<String> l = new ArrayList<String>();
		l.add("문자열 리스트");
		System.out.println(l.get(0));
		
		List<A> aa = new ArrayList<A>();
		
		A a1 = new A();
		a1.setA("클래스1 문자열");
		aa.add(a1);
		A a2 = new A();
		a2.setA("클래스2 문자열");
		aa.add(a2);
		A a3 = new A();
		a3.setA("클래스3 문자열");
		aa.add(a3);
		System.out.println(aa.get(0));
		System.out.println(aa.get(1));
		System.out.println(aa.get(2));
		
	}

}
