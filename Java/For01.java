package day02;

public class For01 {

	public static void main(String[] args) {
		int i, j;
		for(j=0, i=0; i<=5; i++) {
			j += i;
			System.out.print(i);
			if(i==5) {
				System.out.print("=");
				System.out.print(j);
			}
			else {
				System.out.print("+");
			}
		}
	}
}

/*
  출력값: 
  0+1+2+3+4+5 = 15 
 */
