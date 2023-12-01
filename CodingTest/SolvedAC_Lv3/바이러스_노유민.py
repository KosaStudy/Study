from collections import deque


def BFS(g, visited, z, count):
    visited[z] = True
    q = deque()

    q.append(z)

    while q:
        x = q.popleft()
        for i in g[x]:
            if visited[i] == False:
                visited[i] = True
                count += 1
                q.append(i)
    return count


N = int(input())
M = int(input())


g = [[] for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, input().split())
    g[a].append(b)
    g[b].append(a)

visited = [False for _ in range(N+1)]
count = 0
print(BFS(g, visited, 1, count))
