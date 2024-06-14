
#include <stdio.h>


// 1차원 배열과 포인터
int main(){
    int a[3] = {1,2};
    int *p = a;
    printf("%d %d %d\n", a[0], a[1], a[2]);
    printf("%d %d %d\n", *a, *(a+1), *(a+2)); //a == &a[0] , a+1 == &a[1], a+2 == &a[2] -> *(&a[0]), *(&a[1]), *(&a[2])
    printf("%d %d %d\n", *p, *(p+1), *(p+2)); //p라는 포인터 변수에 저장된 주소값이 a 배열 주소값과 동일하므로 위와 동일
    printf("%d %d %d\n", p[0], p[1], p[2]); 
}