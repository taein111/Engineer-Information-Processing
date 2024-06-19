
#include <stdio.h>

struct student{
    int n, g;
};
int main(){
    struct student st[2];
    int i = 0;
    for (i; i<2; i++){
        st[i].n = i; //st[0].n : 0 , st[1].n : 1
        st[i].g = i+1; // st[0].g : 1, st[1].g : 2
    }
    printf("%d", st[0].n +st[1].g);  // 0+2
    return 0;
}