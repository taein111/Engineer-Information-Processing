package day02;
abstract class Vehicle{
	String name;
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name:" + name;
	}
	public void setName(String val) {
		name = val;
	}
}

class Car extends Vehicle{
	public Car(String val) {
		setName(val);
	}
	
	public String getName(String val) {
		return "Car name: " + val;
	}
	
	public String getName(byte val[]) {
		return "Car name:" + val;
	}
}


public class Abstract01 {

	public static void main(String[] args) {
		Vehicle obj = new Car("Spark");
		System.out.println(obj.getName());
	}
}

/* 1. main 실행 -> Car라는 생성자를 실행하면서 매개변수로 "Spark" 전달  , obj 변수에 Car 클래스가 생성된다.
	2. Car 클래스의 생성자인 Car(String val)에 "Spark"를 넘겨주면 val = Spark이 됨
	3. setName("Spark"); 으로 호출 , setName은 Vehicle 클래스에 있으므로 Vehicle 클래스의 setName 메서드에 "Spark"값 전달
	4. setName 메서드에서 매개변수로 받은 "Spark"를 val 변수에 저장, 이후 name 변수에 저장
	5. 이후 다시 메인에서 obj.getName 메서드 호출 
	6. getName에 파라미터가 없으므로 부모 클래스의 gatName 메서드를 실행하게 되고, Vehicle의 getName에 있는 "Vehicle name:" + name; 을 반환한다
	7. name은 이미 new Car("Spark")라는 생성자에 의해서 "Spark" 라는 값으로 대입이 되었기 때문에 getName에서는 "Vehicle name: Spark" 가 된다. 
 */
 	
