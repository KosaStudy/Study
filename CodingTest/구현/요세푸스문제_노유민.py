import sys
from collections import deque

input = sys.stdin.readline

n,k = map(int,input().split())

q=[i+1 for i in range(n)]

q=deque(q)

print("<",end="")
while len(q)>0:
    if len(q)==1:
        print(q.popleft(),end="")
        break
    q.rotate(-(k-1))
    print(q.popleft(),end=", ")

print(">")
