
#include <stdio.h>

void fn(){
    static int a = 3;
    a = a + 1;
    printf("%d\n", a);
}

int main(){
    fn();
    fn();
    return 0;
}
// 코드 해설
/* 1.stdio.h 헤더 파일을 읽는다
    2. static 변수가 있으므로 a라는 변수는 3으로 초기화
    3. main함수부터 시작 -> fn()함수 호출
    4. 프로그램 시작할 때 static변수 처리했으므로 3이라는 값으로 초기화 하지 않는다
    5. a는 3이므로 3+1을 a라는 변수에 대입한다
    6. 마찬가지로 다음 fn함수 호출해도 static 변수를 3이라는 값으로 초기화 하지 않는다
    7. a는 4이므로 4+1을 a라는 변수에 대입한다
    8. a 값인 5 출력

    */