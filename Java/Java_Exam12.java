
public class Java_Exam12 {

	public static void main(String[] args) {
		int[] result = new int[5];
		int[] arr = {79, 34, 10, 99, 50};
		for(int i = 0; i<5; i++) {
			result[i] = 1;
			for(int j=0; j<5; j++) {
				if(arr[i]<arr[j]) //arr 배열에 담겨잇는 값들을 첫번 째 숫자부터 비교
					result[i]++; //다음 인덱스에 자신의 인덱스값보다 큰 값이 있을때 마다 result 배열의 값을 수정
			}
		}
		for(int k = 0; k < 5; k++) {
			System.out.print(result[k]); //result 배열의 각 인덱스 값을 출력 ...24513
		}
	}

}
