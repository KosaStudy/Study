from collections import deque
import sys

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

n = int(input())


def bfs(graph, a, b):
    n = len(graph)
    q = deque()
    q.append((a, b))
    graph[a][b] = 0
    count = 1
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                q.append((nx, ny))
                count += 1
    return count


count_list = []
graph = [list(map(int, input())) for _ in range(n)]

for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            count_list.append(bfs(graph, i, j))

count_list.sort()
print(len(count_list))
for i in count_list:
    print(i)