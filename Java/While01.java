
public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i<10) {
			i++;
			if(i%2==1)
				continue;
			sum += i;
		}
		System.out.println(sum);
	}

}

/* i%2 == 1 , 즉, 2로 나눴을때 나머지가 1인 수 -> 홀수를 제외하고 짝수만 sum에 대입하여 10(최종적으로 i++ 했을때 i는 10이 된다)까지 더한다
2+4+6+8+10  -> 30 */