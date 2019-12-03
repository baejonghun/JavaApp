package kr.gudi.test;

public class D extends B {

	void run() {
		System.out.println("C");
		System.out.println(c);
		c = 3;
		System.out.println(c);
		System.out.println(super.c);
	}
	
}
