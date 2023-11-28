import sys

input = sys.stdin.readline

n = int(input())
stairs = [int(input()) for _ in range(n)]

dp = [0] * n

if n == 1:
    print(stairs[0])
    exit()
if n == 2:
    print(stairs[0] + stairs[1])
    exit()

dp[0] = stairs[0]
dp[1] = stairs[0] + stairs[1]
dp[2] = max(stairs[0] + stairs[2], stairs[1] + stairs[2])

# 연속 3개를 안 밟으려면 -> i-3까지 오는 값 + i-1 칸 + 현재칸  / i-2 칸까지 오는 값 + 현재 칸
for i in range(3, n):
    dp[i] = max(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i])

print(dp[n - 1])
