abstract class Vehicle{
	String name;
	abstract public String getName(String val);
	public String getName() { //j
		return "Vehicle name: " + name;
	}
	public void setName(String val) { // Spark를 받아와서
		name = val; // name에 저장
	}
}

class Car extends Vehicle{ //obj의 객체 Car(Vehicle을 상속받음 -> Vehicle 추상클래스의 매개변수 없는 getName 메서드를 가지고있음)
	public Car(String val) { //new Car("Spark") 로 생성자 호출되었을때 실행됨
		setName(val); // setName("Spark")가 됨
	}
	public String getName(String val) {
		return "Car name:" + val;
	}
	public String getName(byte val[]) {
		return "Car name: " + val;
	}
}


public class Java_Exam01 {

	public static void main(String[] args) {
		Vehicle obj = new Car("Spark"); //Car 클래스 객체 obj 생성, 
 		System.out.println(obj.getName()); // obj의 매개변수 업는 getName 호출
	}
}
