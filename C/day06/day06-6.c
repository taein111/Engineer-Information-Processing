
#include <stdio.h>
#include <string.h>

// 문자열 함수 strcat , strncat
int main(){
    char a[20] = "Hello";
    char b[10] = "Soojebi";
    char c[20] = "Hello";
    strcat(a, b); 
    printf("%s %s\n", a, b); // a : HelloSoojebi , b: Soojebi
    strncat(c, b, 3);
    printf("%s %s", c, b); // c : HelloSoo, b: Soojebi
    return 0;
}