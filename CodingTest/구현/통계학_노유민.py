from collections import defaultdict
import sys

input = sys.stdin.readline
N = int(input())

numlist=[]
numdic=defaultdict(int)
_sum=0
for _ in range(N):
  num=int(input())
  numlist.append(num)
  numdic[num]+=1
  _sum+=num

numlist.sort()
numdic =sorted(numdic.items(),key=lambda x:(-x[1],x[0]))
print(round(_sum/N))

print(numlist[N//2])

if N>1:
  if numdic[0][1]==numdic[1][1]:
    print(numdic[1][0])
  else:
    print(numdic[0][0])
else:
    print(numdic[0][0])

print(numlist[-1]-numlist[0])
