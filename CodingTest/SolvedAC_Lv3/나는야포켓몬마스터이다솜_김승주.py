import sys

input = sys.stdin.readline

n, m = map(int, input().split())

dict = {}

for i in range(1, n + 1):
    tmp = input().rstrip()
    dict[i] = tmp
    dict[tmp] = i

for i in range(m):
    find = input().rstrip()

    if find.isdigit():
        print(dict[int(find)])
    else:
        print(dict[find])
