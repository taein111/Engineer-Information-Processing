
#include <stdio.h>
#include <string.h>

// 문자열 비교 함수 strcmp (ASCII 코드 값 비교)
int main(){
    char a[10] = "HelloA";
    char b[10] = "HelloB";
    int c = strcmp(a, b);
    printf("%d\n", c); //-1
    c = strncmp(a,b,3);
    printf("%d",c); //0
    return 0;
    
}