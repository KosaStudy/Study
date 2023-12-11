n = int(input())

person = list()
answer = [n for _ in range(n)]

for i in range(n):
    x, y = map(int, input().split())
    person.append([x, y])

for i in range(len(person)):
    for j in range(i+1, len(person)):
        if person[i][0] > person[j][0] and person[i][1] > person[j][1]:
            answer[i] -= 1
        elif person[i][0] < person[j][0] and person[i][1] < person[j][1]:
            answer[j] -= 1
        else:
            answer[i] -= 1
            answer[j] -= 1

for a in answer:
    print(a, end=' ')
