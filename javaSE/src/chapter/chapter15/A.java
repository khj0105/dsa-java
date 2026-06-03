package chapter.chapter15;

public class A {
	int a;
	
	public A(int a){
		this(); // 다른 생성자 아래의 A()을 호출. 이때, 다른 생성자를 호출하는 코드는 제일 먼저 위치해 있어야 함.
		this.a = a;
		System.out.println("매개변수를 받는 생성자 호출");
	} /* b()에서 ()는 파라미터, (int a)가 매개변수 매개변수와 파라미터 같은 의미*/
	public A(){
		System.out.println("매개변수를 받지 않는 생성자 호출");
	}
	
	public void add() {}
	
	public static void main(String[] args) {
		A a = new A(20);
	//	A a = new A();
		System.out.println("a의 값: " + a.a);
	}
}
