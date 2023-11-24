expr = input().split('-')

answer = 0

for m in range(len(expr)):
    li = expr[m].split('+')

    if m == 0:
        for num in li:
            answer += int(num)
    else:
        answer -= sum(map(int, li))

print(answer)
