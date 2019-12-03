package kr.gudi.test;

public class C extends B {

	void run() {
		System.out.println("D");
		System.out.println(c);
		c = 7;
		System.out.println(c);
		System.out.println(super.c);
	}
	
}
