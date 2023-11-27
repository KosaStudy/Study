from collections import deque


def BFS(a, b, visited, answer):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    visited[a][b] = True
    q = deque()
    q.append((a, b))
    answer[a][b] = 1
    while q:

        x, y = q.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if 0 <= nx < N and 0 <= ny < M and visited[nx][ny] != True and g[nx][ny] == '1':
                q.append((nx, ny))
                visited[nx][ny] = True
                answer[nx][ny] = answer[x][y]+1
    return answer[N-1][M-1]


N, M = map(int, input().split())

g = []
for _ in range(N):
    g.append(list(input()))

answer = [[0 for _ in range(M)] for _ in range(N)]
visited = [[False for _ in range(M)] for _ in range(N)]
print(BFS(0, 0, visited, answer))
