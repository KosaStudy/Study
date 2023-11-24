from collections import deque

n, m, v = list(map(int, input().split()))
graph = [[] * n for _ in range(n + 1)]

for i in range(m):
    f, s = map(int, input().split())
    graph[f].append(s)
    graph[s].append(f)

for i in range(n+1):
    graph[i].sort()

visited = [False] * (n + 1)


def dfs(v):
    print(v, end=" ")
    visited[v] = True

    for next in graph[v]:
        if not visited[next]:
            dfs(next)


def bfs(v):
    que = deque()

    visited = [False] * (n + 1)

    que.append(v)
    visited[v] = True

    while que:
        v = que.popleft()
        print(v, end=" ")
        for next in graph[v]:
            if not visited[next]:
                que.append(next)
                visited[next] = True


dfs(v)
print()
bfs(v)
