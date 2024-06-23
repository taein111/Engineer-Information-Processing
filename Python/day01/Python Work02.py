a = [20, 10, 30]
print(a) #[20, 10, 30]
a.extend(a)
print(a) #[20, 10, 30, 20, 10, 30]
a.pop()
print(a) #[20, 10, 30, 20, 10]
a.reverse()
print(a) #[10, 20, 30, 10, 20]