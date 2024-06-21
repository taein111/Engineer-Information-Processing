//2차원 배열
public class Java_Exam02 {

	public static void main(String[] args) {
		int[][] a = new int[3][5];
		for(int i=0; i<3; i++) { //0,1, 2 까지 증가 ,
			for(int j=0; j<5; j++) { //0,1,2,3,4, 까지 증가 
				a[i][j] = j*3+(i+1); //a[0][0]부터 시작해서 a[0][1], a[0][2] ... a[2][a4] 까지 출력 , 5개 단위 즉, j의 0~4인덱스까지 5개 연속 출력 후 개행 
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(); 
		}
	}

}
