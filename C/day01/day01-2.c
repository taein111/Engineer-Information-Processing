
#include <stdio.h>

int a = 5;

void fn(){
    a = a + 3;
}

int main()
{
    a = a+5;
    fn();
    printf("%d", a);
    return 0;
}

// 코드 해설
/* 1.stdio.h 헤더 파일을 읽는다
    2. a라는 변수에 5를 대입 ( 전역변수)
    3. main함수부터 시작 -> a는 5가 저장되어 있으므로 10을 a에 저장
    4. fn이라는 사용자정의 함수 호출
    5. a는 10이 저장되어있으므로 fn에서 a는 10, 즉 10+3 13이된다
    6. a는 13이므로 13을 출력
    */