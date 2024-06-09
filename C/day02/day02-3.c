
#include <stdio.h>

int main(){
    int x=3, y=3;
    int z = x++ + ++y;
    printf("%d %d %d", x, y, z);
    return 0;
}

// 코드 해설
/* 1.stdio.h 헤더 파일을 읽는다
    2. main 함수 실행
    3. x, y라는 이름의 int(정수)형 변수 선언, 각 3으로 초기화
    4. x++ 일 경우 x의 값인 3을 먼저 연산에 사용하고 x를 증가시키고, 
        ++y일 경우 y의 값을 1 증가시킨 후에 y의 값인 4를 연산에 사용하므로 3+4인
        7이 z에 저장된다
    5. x는 4, y는 4, z는 7
    */
    
    