
#include <stdio.h>


// 포인터
int main(){
    int a = 10;
    int* b = &a;
    printf("%d %d %d", a, *b, *(&a)); // *b는 b라는 표인터 변수가 저장하고 있는 주소에 있는 값 출력 -> 10
                                    //*(&a) 는 *과 &가 서로 반대연산이므로 상쇄되므로, a값 출력 -> 10
    return 0;
}