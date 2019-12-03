package kr.gudi.test;

public class A implements I, II {
	
	@Override
	public void run() {
		System.out.println("A > I 추상 메소드 구성");
	}

	@Override
	public void run2() {
		System.out.println("A > II 추상 메소드 구성");		
	}
	
}
