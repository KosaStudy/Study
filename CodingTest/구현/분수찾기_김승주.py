# 짝 -> 분자 증가 / 분모 감소
# 홀 -> 분자 감소 / 분모 증가

n = int(input())
l = 1

while n > l:
    n -= l
    l += 1

if l % 2 == 0:
    up = n
    down = l - n + 1
else:
    up = l - n + 1
    down = n

print(up, "/", down)
