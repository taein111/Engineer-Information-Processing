
#include <stdio.h>

int main(){
    int *arr[3]; 
    int a = 12, b = 24, c = 36;
    arr[0] = &a; //a의 주소값
    arr[1] = &b; //b의 주소값
    arr[2] = &c; //c의 주소값
    printf("%d\n", *arr[1] + **arr + 1); // *arr[1]은 arr[1]의 값을 의미 : 24, **arr은 *arr[0]을 의미, 즉 arr[0]의 값 : 12, -> 24+12+1
    return 0;
    
}