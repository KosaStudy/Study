import sys

input = sys.stdin.readline

n,m = map(int,input().split())
li_id = dict()
li_name=dict()

for i  in range(n):
    value=input().rstrip()
    li_id[i+1]=value
    li_name[value]=i+1

answer=[]
for i in range(m):
    quest = input().rstrip()
    if quest.isdigit():
        answer.append(li_id[int(quest)])
    else:
        answer.append(li_name[quest])

for i in answer:
    print(i)
