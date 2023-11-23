n = int(input())

m = int(input())

if m != 0:
    broken = list(input().split())  # 주의
else:
    broken = []

min_val = abs(100 - n)

for i in range(0, 1000001):  # 가능한 채널 값 2배까지 일단 계산
    check = True
    for j in str(i):
        if j in broken:
            check = False
            break
    if check:
        min_val = min(min_val, abs(i - n) + len(str(i)))

print(min_val)
