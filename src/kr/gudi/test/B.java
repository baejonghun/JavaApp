package kr.gudi.test;

public abstract class B {
	int a;
	final int b = 0;
	void test() {
		System.out.println("B에 test() 호출");
	}
	
	abstract void run();
	
}
