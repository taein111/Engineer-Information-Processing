
public class Switch01 {

	public static void main(String[] args) {
		int i = 3;
		int k = 1;
		switch(i) {
		case 0:
		case 1:
		case 2:
		case 3: k=0;
		case 4: k+=3;
		case 5: k-=10;
		default: k--;
		}
		System.out.println(k);
	}

}

/* i = 3이므로 case3 으로 진입
	k=0에 의해 k는 0이 됨
	braek가 없으므로 다음 명령어 실행
	k+=3을 실행하여 k는 3이 됨
	break가 없으므로 다음 명령어 실행
	k-=10 실행하여 k는 -7이 됨
	k--를 실행하여 k는 -8이 됨
	k값인 -8 출력 */