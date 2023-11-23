"""
    - 재귀로 구하면 시간 초과
    - DP를 활용
"""
test_case = int(input())
count0 = [0] * 41
count1 = [0] * 41
count0[0], count1[1] = 1, 1

for i in range(2, 41):
    count0[i] = count0[i - 1] + count0[i - 2]
    count1[i] = count1[i - 1] + count1[i - 2]

for t in range(test_case):
    n = int(input())
    print(" ".join(map(str, [count0[n], count1[n]])))
