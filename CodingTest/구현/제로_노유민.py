n=int(input())

list_n=[]

for i in range(n):
    num=int(input())
    if num==0:
        list_n.pop()
    else:
        list_n.append(num)

print(sum(list_n))
