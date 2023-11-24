import sys


n, m = map(int, sys.stdin.readline().split())
pocketmon_name_to_num = {}
pocketmon_num_to_name = {}

for i in range(1, n+1):
    name = sys.stdin.readline().strip()
    pocketmon_name_to_num[name] = i
    pocketmon_num_to_name[i] = name

for _ in range(m):
    question = sys.stdin.readline().strip()
    if question.isdigit():
        print(pocketmon_num_to_name[int(question)])
    else:
        print(pocketmon_name_to_num[question])
