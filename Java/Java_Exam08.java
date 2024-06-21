//static 메서드 이해
public class Java_Exam08 {

	public static void main(String[] args) {
		System.out.print(Java_Exam08.check(1)); // 일반적으로 check 메서드를 호출하기 위해서는 new Java_Exam08() 을 생성해서 호출해야하지만,
												// check 메서드가 현재 static 메서드이기 때문에 인스턴스 없이 호출 가능하다.
	}
	static String check(int num) { 
		return (num >= 0) ? "positive" : "negative";
	}
}
