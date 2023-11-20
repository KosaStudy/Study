import sys
from collections import deque

input = sys.stdin.readline


def BFS(N):
  q=deque()

  q.append(N)
  graph[N]+=1

  while q:
    x = q.popleft()
    if x==K:
      break
    nx=[x-1,x+1,x*2]

    for i in nx:
      if 0<=i<=100000:
        if graph[i]==0:
          q.append(i)
          graph[i]=graph[x]+1

N, K = map(int, input().split())
graph = [0] * 100001
BFS(N)

print(graph[K]-1)
