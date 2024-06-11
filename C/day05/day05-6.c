
#include <stdio.h>



int main(){
    char a[2][8] = {"Hello", "Soojebi"};
    printf("%s\n", a[0]); //Hello
    printf("%s\n", a[1]); // Soojebi
    printf("%s\n", a[1]+3); // a[1][3]  ->  jebi
    a[1][4] = NULL;
    printf("%s\n", a[1]+2); // a[1][2] -> oj
    return 0;
}

