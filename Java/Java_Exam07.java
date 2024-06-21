class Taein{
	static private Taein instance = null;
	private int count = 0;
	static public Taein get() {
		if(instance == null) {
			instance = new Taein();
		}
		return instance;
	}
	public void count() {
		count++;
	}
	public int getCount() {
		return count;
	}
	
}


public class Java_Exam07 {

	public static void main(String[] args) {
		Taein t1 = Taein.get(); //처음 Taein 클래스의 instance 는 null 이므로  Taein클래스 instance 객체 생성하고, 반환한다/
		t1.count(); // count값 0에서 1 증가
		Taein t2 = Taein.get(); // 위에서 instance 생성하였으므로 null이 아니므로, 그대로 t1과 같은 instance를 반환한다.
		t2.count(); // count 값 1에서 2로 증가
		Taein t3 = Taein.get(); // 위에서 instance 생성하였으므로 null이 아니므로, 그대로 t1과 같은 instance를 반환한다.
		t3.count(); // count 값 2에서 3으로 증가
		System.out.print(t1.getCount());  // t1, t2, t3 모두 같은 인스턴스를 반환하고 있으므로, t1의 count값은 3이 된 상태이다.
	}
}
