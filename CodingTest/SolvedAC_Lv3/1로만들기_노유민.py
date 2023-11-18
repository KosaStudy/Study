# import sys
# sys.setrecursionlimit(10**6)

# N=int(input())
# count=0
# result=[]

# def DFS(n,cnt):

#   if n==1:
#     result.append(cnt)
#     return
  
#   DFS(n-1,cnt+1)
#   if n%3==0:
#     DFS(n//3,cnt+1)
#   if n%2==0:
#     DFS(n//2,cnt+1)
  

# DFS(N,count)

# print(min(result))
#메모리초과
#--------------------------------
import sys
from collections import deque

N = int(input())

def BFS(n):
    queue = deque([(n, 0)])
    visited = set()
    
    while queue:
        num, count = queue.popleft()
        if num == 1:
            return count
        
        visited.add(num)
        if num % 3 == 0 and num // 3 not in visited:
            queue.append((num // 3, count + 1))
        if num % 2 == 0 and num // 2 not in visited:
            queue.append((num // 2, count + 1))
        if num - 1 not in visited:
            queue.append((num - 1, count + 1))

result = BFS(N)
print(result)
