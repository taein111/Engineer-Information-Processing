
public class Java_Exam06 {

	public static void main(String[] args) {
		Java_Exam06 a1 = new Java_Exam06();
		ovr2 a2 = new ovr2();
		System.out.print(a1.san(3,2) + a2.san(3,2)); //a1 의 san 메서드는 3+2 즉 5 이며, a2의 san 메서드 호출을 통해 받아온 값은 6이 되며, 둘을 더하면 11
	}
	int san(int x, int y) {
		return x+y;
	}

}

class ovr2 extends Java_Exam06{
	int san(int x, int y) { // 3, 2
		return x - y + super.san(x, y); // return 3-2 + super.san(x,y) 는 부모 클래스 즉 Java_Exam06의 san 메서드를 호출한다. 즉 return 3-2+5 , 6이 된다
	}
}
