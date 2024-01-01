n = int(input())

dp = [0 for _ in range(n+1)]
t = [0 for _ in range(n+1)]
p = [0 for _ in range(n+1)]

for i in range(n):
    t[i], p[i] = map(int, input().split())

for i in range(0, n):
    for j in range(i+t[i], n+1):
        dp[j] = max(dp[j], dp[i] + p[i])

print(dp[-1])