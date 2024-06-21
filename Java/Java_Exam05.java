
public class Java_Exam05 {

	public static void main(String[] args) {
		int i,j;
		for(j=0,i=0; i<=5; i++) {
			j+=i; //0부터 5까지 값을 더해 j 변수에 저장
			System.out.print(i); //i가 0부터 5까지 증가
			if(i==5) { //i값을 증가시키다가 5가 되면, else문이 끝나고 = j, 즉 j의 값 15 출력  
				System.out.print("=");
				System.out.print(j); //즉, 0+1+2+3+4+5 = 15 
			}
			else {
				System.out.print("+"); // if(i==5)를만족하기 전 까지 i값을 출력 후 +를 붙인다. 즉, 0+1+2+3+4+5 
			}
		}
	}

}
