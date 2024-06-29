
#include<stdio.h>
int a(int i){return i;}
int b(int i, int j){return i-j;}
int main(){
    int(*p)(int);
    int(*pf)(int, int);
    p=a;
    printf("%d", p(5)); // p는 int 형 변수 1개 사용하는 사용자 정의 함수를 대신한다
    pf=b;
    printf("%d", pf(5, 4)); //pf는 int형 변수 2개를 사용하는 사용자 정의 함수를 대신한다.
}