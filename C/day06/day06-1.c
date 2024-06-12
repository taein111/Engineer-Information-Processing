
#include <stdio.h>


// 구조체
struct Student{
    char gender;
    int age;
};

int main(){
    struct Student s = {'F', 21};
    s.gender = 'M';
    printf("%c", s.gender);
    printf("%d", s.age);
    return 0;
}

