
#include <stdio.h>


// call by reference

int fn(int* m){
    *m = 7;
    
}
int main(){
    int n = 5;
    int o[3] = {1, 2, 3};
    int i;
    fn(&n);
    fn(&o[1]);
    printf("%d\n", n); //7
    for(i=0; i<3; i++)
        printf("%d", o[i]); //173
        return 0;
}