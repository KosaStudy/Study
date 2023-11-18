from collections import deque

N,M = map(int,input().split())
graph=[[] for _ in range(N+1)]
answer=[]
for _ in range(M):
  a,b = map(int,input().split())
  graph[a].append(b)
  graph[b].append(a)

def BFS(n,visited,graph):
  visited[n]=1
  q=deque()
  q.append(n)
  while q:
    x=q.popleft()
    for i in graph[x]:
      if visited[i]==0:
        visited[i]=visited[x]+1
        q.append(i)

i=1
while i<N+1:
  result=0
  visited=[0 for _ in range(N+1)]
  BFS(i,visited,graph)

  for j in range(1,len(visited)):
    result+=(visited[j]-1)
  answer.append((i,result))
  i+=1

answer.sort(key=lambda x:x[1])
print(answer[0][0])