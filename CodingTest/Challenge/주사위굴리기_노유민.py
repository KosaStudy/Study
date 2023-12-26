n, m, x, y, k = map(int, input().split())


def turnDice(dir):
    a, b, c, d, e, f = dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]
    if dir == 1:
        dice[0], dice[2], dice[3], dice[5] = d, a, f, c

    elif dir == 2:
        dice[0], dice[2], dice[3], dice[5] = c, f, a, d

    elif dir == 3:
        dice[0], dice[1], dice[4], dice[5] = e, a, f, b

    else:
        dice[0], dice[1], dice[4], dice[5] = b, f, a, e


graph = []
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
dice = [0, 0, 0, 0, 0, 0]

for i in range(n):
    graph.append(list(map(int, input().split())))

order = list(map(int, input().split()))

nx, ny = x, y
for i in order:
    nx += dx[i-1]
    ny += dy[i-1]

    if nx < 0 or nx >= n or ny < 0 or ny >= m:
        nx -= dx[i-1]
        ny -= dy[i-1]
        continue
    turnDice(i)
    if graph[nx][ny] == 0:
        graph[nx][ny] = dice[-1]
    else:
        dice[-1] = graph[nx][ny]
        graph[nx][ny] = 0

    print(dice[0])