class Parent{
	int x =100; //x값 500으로 변경
	Parent(){경
		this(500);
	}
	Parent(int x){
		this.x = x; 
	}
	int getX() {
		return x; //return 500
	}
}

class Child extends Parent {
	int x = 4000;
	Child(){
		this(5000);
	}
	Child(int x){
		this.x = x;
	}
}

public class Java_Exam17 {

	public static void main(String[] args) {
		Child obj = new Child();//Child 생성자 호출, Child는 자식 클래스이므로 먼저 부모 클래스(Parent)의 디폴트 생성자 먼저 호출한다).
								//디폴트 생성자가 있으므로 this(5000) 즉, 매개변수에 정수값 하나만 받는 Child(int x) 생성자 실행
		System.out.println(obj.getX()); // getX()는 Parent클래스에만 있으므로 500 출력 ***100이 아님!!
	}

}
