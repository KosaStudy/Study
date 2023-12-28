import sys

input = sys.stdin.readline

N=int(input())

work = [list(map(int,input().split())) for i in range(N)]
dp=[0 for _ in range(N+1)]

for i in range(N):
  for j in range(i+work[i][0],N+1):
    if dp[j]<dp[i]+work[i][1]:
      dp[j]=dp[i]+work[i][1]

print(dp[-1])