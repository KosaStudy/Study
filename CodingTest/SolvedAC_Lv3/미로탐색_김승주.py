from collections import deque

n, m = map(int, input().split())

graph = [[0] * m for _ in range(n)]
for i in range(n):
    s_input = input()
    for j in range(len(s_input)):
        graph[i][j] = int(s_input[j])

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]


def dfs():
    q = deque([])
    q.append((0, 0))

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
                q.append((nx, ny))
                graph[nx][ny] = graph[x][y] + 1

    print(graph[n - 1][m - 1])


dfs()
