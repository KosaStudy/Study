from collections import deque

n = int(input())
k = int(input())

map_ = [[0] * (n + 1) for _ in range(n + 1)]

for i in range(k):
    x, y = map(int, input().split())
    map_[x][y] = 1

map_[1][1] = -1

# -1: 뱀 몸통, 0: 기본 필드, 1: 사과

l = int(input())

# t초 후 c 전환 왼쪽 L, 오른쪽 D

# 우 하 좌 상
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

dr = 0
que = deque()
que.append([1, 1])
snake_body = 1
snake = deque()
timer = 0
before_time = 0
rule = dict()

def direction(c):
    global dr
    # 우 하 좌 상
    if c == 'D':  # 우회전
        if dr == 0:
            # 하
            dr = 1
        elif dr == 1:
            # 좌
            dr = 2
        elif dr == 2:
            # 상
            dr = 3
        else:
            # 우
            dr = 0

    # 우 하 좌 상
    elif c == 'L':  # 좌회전
        if dr == 0:  # 우
            # 상
            dr = 3
        elif dr == 1:
            # 우
            dr = 0
        elif dr == 2:
            # 하
            dr = 1
        elif dr == 3:
            # 좌
            dr = 2
    return dr


for i in range(l):
    t, c = input().split()
    t = int(t)
    rule[t] = c

while True:
    timer += 1

    if que:
        x, y = que.popleft()

    nx = x + dx[dr]
    ny = y + dy[dr]

    if 0 >= nx or nx > n or 0 >= ny or ny > n:
        print(timer)
        break

    elif map_[nx][ny] == -1:
        print(timer)
        break

    snake.append([x, y])
    que.append([nx, ny])

    if map_[nx][ny] == 0:
        rx, ry = snake.popleft()
        map_[rx][ry] = 0

    if map_[nx][ny] == 1:  # 사과
        snake_body += 1

    map_[nx][ny] = -1

    if timer in rule:
        direction(rule[timer])
