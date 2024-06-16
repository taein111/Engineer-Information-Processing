
#include <stdio.h>

struct Soojebi {
    char name[20];
    int os, db, hab1, hab2;
};

int main(){
    struct Soojebi s[3] = {{"데이터1", 95, 88},
                            {"데이터2", 84, 91},
                            {"데이터3", 86, 75}};
    struct Soojebi *p;
    p = &s[0]; //p라는 포인터는 &s[0]인 s를 저장
    (p+1)->hab1 = (p+1)->os + (p+2)-> db; //(p+1)은 s+1과 같으므로 &s[1]과 같다. 즉, &s[1]의 os값 84와 &s[2]의 db값 75를 더하여  159를 hab1에 저장한다
    (p+1)->hab2 = (p+1)->hab1 + p->os + p->db; // 위에서 더한 hab1값 159에 p->os 는 &s[0] -> os 와 같으므로 95와 p->db 값 88을 더해 342를 hab2에 저장한다.
    printf("%d\n", (p+1)->hab1 + (p+1)->hab2); // 159+342
    return 0;
}