
#include <stdio.h>
#define A 5

int main()
{
    printf("합격 %d", A);

    return 0;
}

// 코드 해설
/* 1.stdio.h 헤더 파일을 읽는다
    2. stdio.h 헤더 파일안에 printf 함수가 포함된다
    3. A를 5로 변환한다
    4. 합격이라는 문자열을 printf라는 함수를 이용해 출력한다
    5. %d는 A인 5를 10진수로 출력한다
    6. 함수가 끝나고 0을 반환한다 (main함수가 int main() 으로 되어있기 때문에 return이 있어야한다.)
    */