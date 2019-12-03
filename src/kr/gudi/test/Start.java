package kr.gudi.test;

public class Start {

	public static void main(String[] args) {
		
		I a = new A();
		I c = new C();
		
		a.run();
		c.run();
		
		II aa = new A();
		aa.run2();
		
		A aaa = new A();
		aaa.run();
		aaa.run2();
		
	}

}
