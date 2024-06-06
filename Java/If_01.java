package day03;

public class If_01 {

	public static void main(String[] args) {
		int a = 3, b = 4, c = 3 , d = 5;
		if((a == 2 | a == c) & !(c > d)
				& (1 == b^c != d)) {   // 1==b 는 거짓이므로 0이되고 , c != d 는 참이므로 1, 즉  0^1 은 XOR 연산에 의해 참이되어 1이된다 
 			a = b+c;  // a = 4+3 ,  즉 a는 7
			if(7 == b^c !=a) {   // 7 == b 는 거짓이므로 0이 되고 ,  c != a  즉 3 != 7 이 되므로 참이되어 1이된다. 즉 0^1 은 XOR 연산에 의해 1이되므로 if문 조건 만족, a 출력
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
		else {
			a = c + d;
			if(7 == c^d != a) {
				System.out.println(a);
			}
			else {
				System.out.println(d);
			}
		}
	}
}
