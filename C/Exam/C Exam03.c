
#include <stdio.h>

struct Soojebi{ //Soojebi 구조체
    char name[10];
    int age;

};

int main(){
    struct Soojebi s[] = {"Kim", 28, "Lee", 38, "Seo", 50, "Park", 35}; //Soojebi 구조체 배열 s 선언 , 필드 초기화
    struct Soojebi *p; // p라는 포인터 변수 선언 
    p = s; // p라는 포인터는 s를 저장
    p++; // p++에 의해 값을 1 증가시켰으므로 s+1인 &s[1]를 저장하게 된다. 
    printf("%s\n", p->name);  //s[1]이 가리키는 name : Lee
    printf("%d\n", p->age);   //s[1]이 가리키는 age : 38
    return 0;
}