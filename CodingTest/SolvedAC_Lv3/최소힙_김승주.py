import heapq  # heap 자료형 사용
import sys  # 시간 초과 방지

n = int(sys.stdin.readline().rstrip())
heap = []

for i in range(n):
    info = int(sys.stdin.readline().rstrip())

    if info == 0:
        if heap:
            print(heapq.heappop(heap))  # heapq.heappop(리스트)
        else:
            print(0)
    else:
        heapq.heappush(heap, info)  # heapq.heappush(리스트, 넣을 값)
