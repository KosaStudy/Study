import heapq
import sys

T = int(input())


def delete_heap(heap, delete):
    while heap and not delete[heap[0][1]]:
        heapq.heappop(heap)
    if heap:
        delete[heap[0][1]] = False
        heapq.heappop(heap)
    return heap


for t in range(T):
    N = int(input())
    maxheap = []
    minheap = []
    delete = [False] * N

    for n in range(N):
        com, num = sys.stdin.readline().split()
        num = int(num)
        if com == "I":
            heapq.heappush(maxheap, [-num, n])
            heapq.heappush(minheap, [num, n])
            delete[n] = True
        elif num == 1:
            delete_heap(maxheap, delete)
        elif num == -1:
            delete_heap(minheap, delete)

    while minheap and not delete[minheap[0][1]]:
        heapq.heappop(minheap)
    while maxheap and not delete[maxheap[0][1]]:
        heapq.heappop(maxheap)

    if maxheap and minheap:
        print(-maxheap[0][0], minheap[0][0])
    else:
        print("EMPTY")
