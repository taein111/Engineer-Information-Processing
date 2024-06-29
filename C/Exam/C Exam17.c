
#include<stdio.h>
int main(){
    int a = 1, b = 3;
    switch(++a +b){ // case 5 로 이동
        case 3: printf("A");
        case 4: printf("B");
        break; case 5: printf("C"); //5출력 후 , braek가 없으므로 다음 default 출력 
        default: printf("E");  // "CE"
    }
}