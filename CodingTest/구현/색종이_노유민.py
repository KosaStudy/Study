import sys

input = sys.stdin.readline

N=int(input())

li=[[0 for _ in range(101)] for _ in range(101)]
count=0
for _ in range(N):
  x,y = map(int,input().split())

  for i in range(x,x+10):
    for j in range(y,y+10):
      if li[i][j]!=1:
        li[i][j]=1
        count+=1

print(count)