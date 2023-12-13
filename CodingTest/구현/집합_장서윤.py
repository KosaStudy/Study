import sys

M = int(input())
li = list()

for m in range(M):
    input_ = sys.stdin.readline()
    com = input_.strip().split(' ')

    if com[0] == "add" and int(com[1]) not in li:
        li.append(int(com[1]))
    elif com[0] == "remove" and int(com[1]) in li:
        li.remove(int(com[1]))
    elif com[0] == "check":
        print(1 if int(com[1]) in li else 0)
    elif com[0] == "toggle":
        li.remove(int(com[1])) if int(com[1]) in li else li.append(int(com[1]))
    elif com[0] == "all":
        li = [i for i in range(1, 21)]
    elif com[0] == "empty":
        li = list()
