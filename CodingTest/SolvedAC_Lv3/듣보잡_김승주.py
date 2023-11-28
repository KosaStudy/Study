from collections import Counter

n, m = map(int, input().split())

peoples = []
for i in range(n + m):
    peoples.append(input())

answer = []
for k, v in Counter(peoples).items():
    if v == 2:
        answer.append(k)

answer.sort()
print(len(answer))
for ans in answer:
    print(ans)
