
#include <stdio.h>

int isPrime(int number){
    int i;
    for (i=2; i<number; i++){
        if(number % i == 0) return 0;
    }
    return 1;
}

int main(){
    int number = 13195, max_div=0, i;
    for(i=2; i<number; i++)
        if(isPrime(i) == 1 && number % i == 0)
            max_div=i;
            printf("%d", max_div);
            return 0;
}

/*number % i 는 13195를 i로 나눴을 때 나머지가 업는 수이므로 i가 13195의 약수를 찾아야한다
13195 = 5x7x13x29 이기 때문에 29가 가장 큰 소수이므로 max_div는 29가 되어 29를 출력한다.