a = "Soojebi 123"
print(a.upper()) #대문자
print(a.lower()) #소문자
print(a.isalnum()) #알파벳+숫자+공백 이므로 false
print(a.isalpha())  
print(a.isdecimal())
print(a.isdigit())
print(a.isspace())
print(a.split())# 구분자로 분리, 구분자가 없으므로 디폴트로 띄어쓰기 기준으로 분리 ['Soojebi' , '123']
print(a.split(sep='1')) #구분자인 1을 기준으로 분리 , ['Soojebi', '23']
str = "1,2,3".split(",") #문자열 "1,2,3"에서 콤마(",")를 기준으로 split 해서 리스트로 생성 -> ['1','2','3']
print(str)