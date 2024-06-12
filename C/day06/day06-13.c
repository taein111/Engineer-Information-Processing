
#include <stdio.h>
#include <stdlib.h>
\
//  유틸리티 함수 - atof(ASCII to Floating Point) 문자열을 실수형으로
int main(){
    char *str_num = "1.0";
    double num = atof(str_num);
    printf("%.2f", num); //소수점 둘째자리까지
    return 0;
}
    