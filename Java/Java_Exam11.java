
public class Java_Exam11 {
	int a;
	
	public Java_Exam11(int a) {
		this.a = a; //생성자 호출 받을 때 3을 받아와서 int a의 값은 3으로 저장 됨
	}

	int func() {
		int b = 1;
		for( int i=1; i<a; i++) { //a값은 5로 변경된 상태
			b = a * i + b; // b = 5 * 1 + 1 , b = 5*2+6, b = 5*3+16 , b = 5*4+31 까지 반복 태
		} 
		return a + b; //a값 5, b값 51 -> 56
	}

	public static void main(String[] args) {
		Java_Exam11 obj = new Java_Exam11(3); //정수를 매개변수로 받는 생성자 호출 ( 4번라인)
		obj.a = 5; // 3으로 저장되어있던 a값을 5로 변경 
		int b = obj.func();  // 56
		System.out.print(obj.a + b); // 5+56 
	}

}
