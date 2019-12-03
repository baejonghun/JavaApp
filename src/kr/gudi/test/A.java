package kr.gudi.test;

public class A {

	public static void main(String[] a) {
		
		Object o = new B(4,2);
		
		B  b = (B) o;
		
		System.out.println(b.c);
		
	}
	
}
