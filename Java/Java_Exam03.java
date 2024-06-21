class Parent{
	public int compute(int num) {
		if(num <= 1) return num;
		return compute(num-1)+compute(num-2);
	}
}

class Child extends Parent{
	public int compute(int num) {
		if(num <= 1) return num;
		return compute(num-1)+compute(num-3);
	}
}

public class Java_Exam03 {

	public static void main(String[] args) {
		Parent obj = new Child();
		System.out.println(obj.compute(4)); //Child클래스의 obj 객체 생성
		/*Child 클래스의 compute 메서드에 4를 대입하면
		 * 1. compute(3)+compute(1)
		 * 2. 다시 compute 메서드에 3을 대입 , compute(2) + compute(0)
		 * 3. 다시 compute 메서드에 2를 대입, compute(1)+compute(-1)
		 *  --> num 값이 1보다 작거나 같으면, 그 num 값을 그대로 리턴한다. 즉 
		 *  compute(-1)은 -1 , compute(0)은 0, compute(1)은 1이므로
		 *  3번에서 구하고자하는 compute(2)값은 0이 되고, 2번에서 구하고자 하는 compute(3) 값은 0+0이 되어 0이 되며, 1번에서 구하고자하는 값은 0+1이되어
		 *  최종적으로 출력 값은 1이 된다.
		 
		 * */
	}

}
