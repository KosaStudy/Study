import sys

n, m = map(int, sys.stdin.readline().split())

lib = dict()
lib_num = [0] * (n+1)

for p in range(1, n+1):
    v = sys.stdin.readline().strip()
    lib[v] = p
    lib_num[p]=v

for p in range(1, m+1):
    v = sys.stdin.readline().strip()

    if v.isdigit():
        print(lib_num[int(v)])
    else:
        print(lib[v])
