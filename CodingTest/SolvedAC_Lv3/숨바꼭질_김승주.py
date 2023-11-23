from collections import deque

n, k = map(int, input().split())
visited = [False] * 100001


def bfs(node):
    q = deque([(node, 0)])
    visited[node] = True

    while q:
        x, time = q.popleft()
        if x == k:
            return time

        if 0 <= x + 1 < 100001 and visited[x + 1] == False:
            visited[x + 1] = True
            q.append((x + 1, time + 1))
        if 0 <= x - 1 < 100001 and visited[x - 1] == False:
            visited[x - 1] = True
            q.append((x - 1, time + 1))
        if 0 <= x * 2 < 100001 and visited[x * 2] == False:
            visited[x * 2] = True
            q.append((x * 2, time + 1))


print(bfs(n))
