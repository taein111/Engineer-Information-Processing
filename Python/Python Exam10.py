
#exam09
a = "engineer information processing"
b = a[:3] #처음부터 인덱스 3번 전까지 -> eng
c = a[4:6] #4번 인덱스부터 6번 전까지 -> ne
d = a[29:] # 29번 인덱스부터 끝까지 -> ng
e = b+c+d # engneng
print(e)