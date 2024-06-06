package day03;

class Count{
	static private Count instance = null;
	private int count = 0;
	static public Count get(){ //2. instance는 null인 상태이므로 instance = new Count(); 를 실행하여 instance 변수에 Count 클래스 저장
		if(instance == null) {
			instance = new Count();
		}
		return instance; // 3. instance 변수를 반환
	}

	public void count() {count++;}
	public int getCount() {return count;}
}


public class exam01 {
	public static void main(String[] args) {  
		Count c1 = Count.get(); // 1. Count.get() 메서드 호출 , 4. get()메서드의 instance 반환 값을 s1에 저장
		c1.count(); // 5. c1의 count() 메서드를 실행하면 Count 클래스의 count 값이 1 증가하여 count 값이 1이 됨.
		Count c2 = Count.get(); // 6. Count.get()메서드 호출, 호출헀을때 instance에 Count 객체가 저장된 상태이므로 null이 아니고 if문은 거짓이된다 -> instance 즉 저장해놨던 1 반환
		c2.count();  //7. 저장해놨던 Count 클래스의 count 값이 1 증가하여 2가 됨
		Count c3 = Count.get(); //8. 반복
		c3.count(); //9. 저장해놨던 Count 클래스의 count 값이 1 증가하여 3이 됨.
		System.out.print(c1.getCount()); // 10. 최종적으로 count변수 값을 반환 -> 3 
	}
}
