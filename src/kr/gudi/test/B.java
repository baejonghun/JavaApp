package kr.gudi.test;

public class B {
	private int a;
	private int b;
	int c = 3;
	
	B(){}
	
	B(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + "]";
	}
	
}
