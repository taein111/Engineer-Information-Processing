
#include <stdio.h>

int main(){
    int x=3, y=3;
    printf("%d", x++);
    printf("%d", x);
    printf("%d", ++y);
    printf("%d", y);
    return 0;
}

// 코드 해설
/* 1.stdio.h 헤더 파일을 읽는다
    2. main 함수 실행
    3. x, y라는 이름의 int(정수)형 변수 선언, 각 3으로 초기화
    4. x++ 일 경우 x의 값인 3을 먼저 출력한 후 x값 1 증가
    5. 이후 1 증가된 값인 x = 4를 출력
    6. ++y일 경우 y의 값을 1 증가시킨 후에 y의 값 4 출력
    7. y의 값인 4를 출력
    */
    
    