
#exam06
def func(num1, num2=2): # 두번 째 매개변수는 디폴트가 2이다.
    print('a=', num1, 'b=', num2)
func(20) #기존 func함수는 매개변수를 두 개 받는 함수 이므로 func(20)은 첫번 째 매개변수로 들어간다. 즉 'a= 20 b= 2'