package kr.gudi.test;

public class A extends B {

	void run() {
		System.out.println("A");
		System.out.println(c);
		c = 5;
		System.out.println(c);
		System.out.println(super.c);
		
//		System.out.println(super.toString());
//		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "A [c=" + c + "]";
	}
	
}
