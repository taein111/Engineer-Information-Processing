
public class Java_Exam16 {

	public static void main(String[] args) {
		String str1 = "Taein";
		String str2 = "Taein";
		String str3 = new String("Taein");
		
		System.out.println(str1==str2); //true
		System.out.println(str1==str3); //false
		System.out.println(str1.equals(str3)); //true
		System.out.println(str2.equals(str3)); //true
		

	}

}
