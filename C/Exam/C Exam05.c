
#include <stdio.h>

int Soojebi(int base, int exp){ // 2, 10을 가져옴
    int i, result = 1; 
    for(i=0; i<exp; i++) //i가 exp(10)보다 작을 때 동안, 즉 9 까지 반복
    result *= base; // result 1의 값에 base 값2를 곱해서 저장, i가 0부터 시작하니까 i가 9일떄 까지, 2의 10제곱
    return result; // 1024
}

int main(){
    printf("%d", Soojebi(2,10)); //1024
    return 0;
}