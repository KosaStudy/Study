def fibonacci():
    dp = []

    for i in range(41):
        if i == 0:
            dp.append([1, 0])
        elif i == 1:
            dp.append([0, 1])
        else:
            dp.append([dp[i-1][0] + dp[i-2][0], dp[i-1][1] + dp[i-2][1]])

    return dp


T = int(input())
dp = fibonacci()
print(dp)

for t in range(T):
    n = int(input())
    print(dp[n][0], dp[n][1])
