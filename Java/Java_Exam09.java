
public class Java_Exam09 {

	public static void main(String[] args) {
		int a = 3, b = 4, c = 3, d = 5;
		if((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)){ //첫번째 괄호 a==2 | a==c 는 둘중에 하나만 참이면 1이 되므로 1,
			//두번째 괄호 !(c>d) 는 1, 세 번째 괄호(1 == b ^ c != d)는 xor 연산자로 인해 하나만 참이되면 1이므로 1이 된다. 즉 if문을 만족하게 된다.
			a = b + c; // 만족하게 되어 b+c 로 인해 a값은 7이 되며,
			if(7 == b ^ c != a) { // ^(xor)연산자로 인해 c != a 를 만족하므로 1을 반환, 즉 if문을 만족한다.
				System.out.println(a); //a 값 출력 -> 7
			}
			else {
				System.out.println(b);
			}
		}
		else {
			a = c + d;
			if(7 == c ^ d != a) {
				System.out.println(a);
			}
			else {
				System.out.println(d);
			}
		}
	}
}
