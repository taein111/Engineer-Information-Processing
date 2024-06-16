
#include <stdio.h>


int main(){
    int i=0, c=0;
    while(i<10){
        i++;
        c *= i;
    }
    printf("%d", c); // i가 9까지 증가해서 10까지 곱해도, c 값은 여전히 0이기 때문에 c값에 i값을 10까지 곱해도 결과는 0으로 동일하다
}