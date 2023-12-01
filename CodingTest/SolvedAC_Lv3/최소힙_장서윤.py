import heapq
import sys

n = int(sys.stdin.readline())

arr = []

for i in range(n):
    x = int(sys.stdin.readline())

    if x == 0:
        if arr:
            print(heapq.heappop(arr))
        else:
            print(0)
    else:
        heapq.heappush(arr, x)