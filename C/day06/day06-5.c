
#include <stdio.h>


// 재귀 함수 - 함수 자신이 자신을 부르는 함수
int fn(int n){
    if(n <= 1)
        return 1;
    else
        return n*fn(n-1);
}

int main(){
    printf("%d", fn(3)); //6 
    return 0;
}