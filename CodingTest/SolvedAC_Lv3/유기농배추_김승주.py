from collections import deque

test_case = int(input())
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]


def bfs(i, j):
    q = deque([(i, j)])
    board[i][j] = 0

    while q:
        x, y = q.popleft()
        for d in range(4):
            nx, ny = x + dx[d], y + dy[d]
            if 0 <= nx < n and 0 <= ny < m and board[nx][ny] == 1:
                board[nx][ny] = 0
                q.append((nx, ny))


for t in range(1, test_case + 1):
    m, n, k = map(int, input().split())
    board = [[0] * m for _ in range(n)]

    for _ in range(k):
        y, x = map(int, input().split())
        board[x][y] = 1

    count = 0
    for i in range(n):
        for j in range(m):
            if board[i][j] == 1:
                bfs(i, j)
                count += 1
    print(count)
