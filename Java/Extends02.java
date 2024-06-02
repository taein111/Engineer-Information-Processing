class A{
	private int a;
	public A(int a) {
		this.a = a;
	}
	public void display() {
		System.out.println("a="+a);
	}
}

class B extends A{
	public B(int a) {
		super(a);
		super.display();
	}
}

public class Extends02 {

	public static void main(String[] args) {
		B obj = new B(10);
	}

}

/* main 실행 -> new B(10)에 의해 생성자 호출
- B 생성자는 10을 넘겨받았으므로 a=10
- 자식 클래스의 생성자의 첫 번째 명령어가 super가 있는 경우, 부모 클래스에서 어떤 생성자를 호출하는 지 결정
- B(int a )안에 첫 번째 명령어는 super(10)이므로 부모 클래스의 생성자는 파라미터로 정수형을 받는 생성자인 A(int a)를 호출
- A 생성자는 10을 넘겨받았으므로 a=10
- 클래스 내부 필드인 this.a에 a값인 10을 대입
- 부모 클래스의 display 메서드 호출
- 클래스 내부 필드인 a에 10이 저장되어 있으므로 "a =" + 10" */