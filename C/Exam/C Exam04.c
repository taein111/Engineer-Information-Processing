
#include <stdio.h>

int main(){
    int ary[3] = {1}; // ary 배열은 {1,0,0,0} 상태
    int s = 0;
    int i = 0;
    ary[1] = *(ary+0)+2; //{1,0,0,0} 상태에서  *ary는 ary[0]이므로 *(ary+0)+2; 는 1+2인 3이되어  ary[1] 은 3이 된다.
    ary[2] = *ary+3; // *ary는 ary[0] 이므로 *ary+3 은 1+3 이되어 4가 된다.
    for(i=0; i<3; i++){
        s = s + ary[i];  // 1+3+4
    }
    printf("%d", s); //8
    return 0;
}