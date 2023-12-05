from collections import deque
import sys

input = sys.stdin.readline

k = int(input())
count_list = []
for i in range(k):
    n, m = map(int, input().split())

    q = deque(list(map(int, input().split())))

    count = 0

    while m != -1:
        if q[0] == max(q):
            q.popleft()
            m -= 1
            count += 1
        else:
            q.append(q[0])
            q.popleft()
            if m == 0:
                m = len(q)-1
            else:
                m -= 1

    count_list.append(count)

for i in count_list:
    print(i)
