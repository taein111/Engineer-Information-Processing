
public class Java_Exam13 {
	static int[] MakeArray() {
		int[] tempArr = new int[4];
		for(int i=0; i<tempArr.length; i++) { //길이 4
			tempArr[i] = i; //tempArr[0] = 0, tempArr[1] = 1 ... tempArr[3] = 3
		}
		return tempArr;
	}
	
	
	public static void main(String[] args) {
		int[] intArr;
		intArr = MakeArray(); // tempArr 리턴
		for(int i=0; i<intArr.length; i++){ //길이 4
			System.out.print(intArr[i]); //0123 
		} 
	}
}
