
#include <stdio.h>
#include <string.h>

// 문자열 복사 함수 strcpy
int main(){
    char a[20] = "Hello";
    char b[10] = "Soojebi";
    char c[20] = "Hello";
    strcpy(a, b);
    printf("%s %s\n", a, b); // a : Soojebi , b: Soojebi
    strncpy(c, b, 3);
    printf("%s %s", c, b); // c : Soolo , b : Soojebi
    return 0;
}