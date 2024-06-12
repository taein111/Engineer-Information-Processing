
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

//  유틸리티 함수 - rand
int main(){
    int a;
    int i;
    srand(time(NULL)); // srand 함수에 seed값을 현재 시간으로 주어 rand 함수가 랜덤한 값을 가져오도록 한다
                        // srand(time(NULL)) 을 삭제할 경우 프로그램을 실행할 때마다 똑같은 결과가 나온다
    for(i=0; i<6; i++){
        a= rand()%45+1; // rand는 임의의 값을 반환하고, 반환한 값에 45로 나눴을 때 나머지 (0~44중 하나의 값을 가짐)에 1을 더함 -> 1~45중 임의의 값이 저장된다
        printf("%d", a);
    }
    return 0;
}
    