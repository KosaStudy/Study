import sys

input = sys.stdin.readline

from collections import deque

sys.setrecursionlimit(10**6)


def dfs(node):
    visited[node] = True
    print(node, end=" ")

    for n in sorted(graph[node]):
        if visited[n] == False:
            dfs(n)


def bfs(node):
    visited[node] = True
    q = deque([node])

    while q:
        x = q.popleft()
        print(x, end=" ")

        for n in sorted(graph[x]):
            if visited[n] == False:
                visited[n] = True
                q.append(n)


n, m, v = map(int, input().split())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

visited = [False] * (n + 1)
dfs(v)
print()
visited = [False] * (n + 1)
bfs(v)
