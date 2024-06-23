l = [3, 5, 7]
l.append(3)
print(l) #[3, 5, 7, 3]
l.insert(2, 4)
print(l) # 2번 인덱스 자리에 4를 끼워 넣어야 하므로 [3, 5, 4, 7, 3] 
l.remove(3)
print(l) # 3은 2개이므로 앞의 3이 지워짐 [5, 4, 7, 3] 