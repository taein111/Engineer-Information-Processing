
#include <stdio.h>

int main(){
    int i = 1;
    while (i < 5){
        i++;
        if(i==3)
        break;
        printf("%d", i); //2 
    }
    printf("%d", i); // 3
    return 0;
}

// 출력결과 : 23 
    