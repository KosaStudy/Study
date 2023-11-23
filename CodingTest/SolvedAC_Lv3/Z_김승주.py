n, r, c = map(int, input().split())

count = 0


def dfs(x, y, size):
    global count

    if x > r or x + size <= r or y > c or y + size <= c:
        count += size**2
        return

    if size > 2:
        dfs(x, y, size // 2)
        dfs(x, y + size // 2, size // 2)
        dfs(x + size // 2, y, size // 2)
        dfs(x + size // 2, y + size // 2, size // 2)

    else:
        if x == r and y == c:
            print(count)

        if x == r and y + 1 == c:
            print(count + 1)
        if x + 1 == r and y == c:
            print(count + 2)
        if x + 1 == r and y + 1 == c:
            print(count + 3)
    exit()


dfs(0, 0, 2**n)
