from collections import deque


def DFS(V):
    visited[V] = True

    print(V, end=" ")

    for i in g[V]:
        if visited[i] != True:
            DFS(i)


def BFS(V):
    visited[V] = True

    q = deque([V])

    while q:
        x = q.popleft()

        print(x, end=" ")

        for i in g[x]:
            if visited[i] != True:
                q.append(i)
                visited[i]=True


N, M, V = map(int, input().split())

g = [[] for _ in range(N+1)]

for _ in range(M):
    a, b = map(int, input().split())
    g[a].append(b)
    g[b].append(a)


for i in g:
    i.sort()

visited = [False for _ in range(N+1)]

DFS(V)
print()
visited = [False for _ in range(N+1)]
BFS(V)
