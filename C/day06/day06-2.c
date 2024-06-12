
#include <stdio.h>


// 사용자 정의 함수
char fn(int num){
    if(num % 2 ==0){ 
        return 'Y'; 
    }
    else
        return 'N';
}
    int main(){
        char a = fn(5); //char 타입의 a 변수에 사용자 정의 함수fn(5) 호출 하여 반환되는 return 값으로 초기화
        printf("%c\n", a); //N
        return 0;
    }
