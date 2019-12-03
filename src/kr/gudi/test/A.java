package kr.gudi.test;

import java.util.ArrayList;
import java.util.List;

public class A extends B implements I, II {
	
	@Override
	public void run() {
		System.out.println("추상 메소드 구성");
		List list = new ArrayList();
	}

	@Override
	public void run2() {
		System.out.println("두번째 run()");
	}
	
}
