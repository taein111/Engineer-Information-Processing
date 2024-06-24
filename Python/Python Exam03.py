#exam04
a=100
i=0
result=0
for i in range(1,3): #1부터 3미만까지 1씩 반복증가, 즉 1 , 2 
    result = a >> i # 100 >> 1 은 50 , 그 다음 100 >> 2 는 25 (시프트 연산)
    result += 1 # 25 += 1 -> 26
print(result) # 26