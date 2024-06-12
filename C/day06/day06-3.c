
#include <stdio.h>


// call by value

int fn(int n){
    n =7;
    return n;
}

int main(){
    int n = 5;
    fn(n);
    printf("%d", n); //5
    return 0;
}