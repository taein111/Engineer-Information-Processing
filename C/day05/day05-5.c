
#include <stdio.h>



int main(){
    char a[8] = "Hello";
    printf("%s\n", a); // Hello
    printf("%s\n", a+1); // a[1]부터 읽는다 -> ello
    a[3] = NULL;
    printf("%s\n", a+1); // a[1]부터 읽고, a[3] 에서 null 을 만나므로 a[2] 까지만 읽는다 -> el
    printf("%s\n", a+4); // a[4] 인 o 부터 dlfrekrk a[5]에서 null 을 만나므로 null 직전 값인 a[4]까지인 "o"만 출력
    return 0;
}

