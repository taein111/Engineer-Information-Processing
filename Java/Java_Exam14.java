
public class Java_Exam14 {

	public static void main(String[] args) {
		int a = 0;
		for(int i=1; i<999; i++) { //i가 1부터 998까지 반복증가
			if(i%3 == 0 && i%2 != 0) // 1부터 998까지즈 수 에서 3의 배수 이면서, 짝수가 아닌 것(홀수)의 최대 값
				a = i; //3, 9, 15, 21, 27, 33 ... 993 
		}
		System.out.print(a); // 993
	}

}
