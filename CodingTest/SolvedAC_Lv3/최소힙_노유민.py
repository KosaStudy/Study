import heapq
import sys

input = sys.stdin.readline

h=[]
result = []
n = int(input())

for _ in range(n):
    quest = int(input())
    if quest ==0:
        if len(h)==0:
            result.append(0)
        else:
            result.append(heapq.heappop(h))
        continue
    heapq.heappush(h,quest)

for i in result:
    print(i)