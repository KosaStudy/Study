import sys

sys.setrecursionlimit = 10**6

def DFS(step,idx,num_count,skip_count,curr_step):
  global max_step


  if idx>=len(step)-1:
    if max_step<curr_step:
      max_step=curr_step
    return
  
  if num_count==2:
    DFS(step,idx+1,num_count-2,skip_count+1,curr_step)
  elif skip_count==1:
    DFS(step,idx+1,num_count+1,skip_count-1,curr_step+step[idx+1])
  elif num_count<2 and skip_count<1:
    DFS(step,idx+1,num_count+1,skip_count,curr_step+step[idx+1])
    DFS(step,idx+1,num_count,skip_count+1,curr_step)

N = int(input())

step=[]
for _ in range(N):
  step.append(int(input()))
step.reverse()

num_count=1
skip_count=0
global max_step
max_step=0

DFS(step,0,num_count,skip_count,step[0])

print(max_step)

# DFS 시간초과
#--------------------------------------------------
N = int(input())

step=[0] * 301

for i in range(1,N+1):
  step[i]=int(input())

dp=[0] * 301
dp[1] = step[1]
dp[2] = step[1]+step[2]
dp[3] = max(step[1]+step[3],step[2]+step[3])

for i in range(4,N+1):
  dp[i] = max(dp[i-3] + step[i-1] + step[i],dp[i-2]+step[i])

print(dp[N])
