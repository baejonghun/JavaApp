package kr.gudi.test;

import java.util.ArrayList;
import java.util.List;

public class A {
	
	List<Object> list;
	
	public A(ArrayList<Object> list) {
		this.list = list;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "A [list=" + list.size() + "]";
	}
		
}
