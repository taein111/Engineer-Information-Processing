
#include <stdio.h>
#include <stdlib.h>
\
//  유틸리티 함수 - atoi(ASCII to Integer)
int main(){
    char *a = "1";  // "1"이라는 문자열 생성 후 , a 문자형 포인터가 "1"이라는 문자열을 가리킨다.
    int num = atoi(a); // a변수의 문자열 "1"이 숫자 1로 변환되고, num에 대입
    printf("%d", num);
    return 0;
}
    