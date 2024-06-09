
#include <stdio.h>

int main(){
    int i = 1;
    while(i < 5){
        i++; //  2 4 5 
        if(i == 3)
        continue;
        printf("%d", i);
    }
 printf("%d", i); //5
     return 0;
}

// 출력결과 : 2455 
    