from collections import defaultdict

N,M = map(int,input().split())

name_dic=defaultdict(int)

Nlist=[]
Mlist=[]
answer=[]
for _ in range(N):
  Nlist.append(input())

for _ in range(M):
  Mlist.append(input())

for i in Nlist:
  name_dic[i]+=1
for i in Mlist:
  name_dic[i]+=1

result=sorted(name_dic.items())

for key,value in result:
  if value==2:
    answer.append(key)

print(len(answer))
for i in answer:
  print(i)
#내코드
#------------------------------------------------
# 찾은코드..
n,m=map(int,input().split())

a = set()
for _ in range(n):
  a.add(input())
b = set()
for _ in range(m):
  b.add(input())

result=sorted(list(a&b))

print(len(result))
for i in result:
  print(i)