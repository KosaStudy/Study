from collections import deque


def bfs(map_, x, y):
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]

    que = deque()
    que.append([x, y])

    while que:
        x, y = que.popleft()

        for idx in range(4):
            nx = x + dx[idx]
            ny = y + dy[idx]

            if 0 <= nx < N and 0 <= ny < M and map_[nx][ny] == 1:
                map_[nx][ny] = -1
                que.append([nx, ny])


T = int(input())

for t in range(T):
    M, N, K = map(int, input().split(' '))
    map_ = [[0] * M for _ in range(N)]
    answer = 0

    for k in range(K):
        y, x = map(int, input().split())
        map_[x][y] = 1

    for m in range(N):
        for n in range(M):
            if map_[m][n] == 1:
                bfs(map_, m, n)
                answer += 1

    print(answer)