import sys
import heapq

for T in range(int(sys.stdin.readline())):
    k = int(sys.stdin.readline())
    visited = [False] * k
    maxheap, minheap = [], []
    for i in range(k):
        operation, n = sys.stdin.readline().split()
        n = int(n)

        if operation == 'I':
            heapq.heappush(minheap, (n, i))
            heapq.heappush(maxheap, (-n, i))
            visited[i] = True
        elif n == 1:
            while maxheap and not visited[maxheap[0][1]]:
                heapq.heappop(maxheap)
            if maxheap:
                visited[maxheap[0][1]] = False
                heapq.heappop(maxheap)
        else:
            while minheap and not visited[minheap[0][1]]:
                heapq.heappop(minheap)
            if minheap:
                visited[minheap[0][1]] = False
                heapq.heappop(minheap)
    while minheap and not visited[minheap[0][1]]:
        heapq.heappop(minheap)
    while maxheap and not visited[maxheap[0][1]]:
        heapq.heappop(maxheap)
    print(-maxheap[0][0], minheap[0][0]) if maxheap and minheap else print("EMPTY")