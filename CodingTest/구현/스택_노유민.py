def push(x):
    list_n.append(x)

def pop():
    if size()==0:
        return -1
    else:
        return list_n.pop()

def size():
    return len(list_n)

def empty():
    if size()==0:
        return 1
    else:
        return 0

def top():
    if size()==0:
        return -1
    else:
        return list_n[-1]

n=int(input())

list_n=[]

quest=[]
for i in range(n):
    quest.append(input().split())


for i in range(len(quest)):
    if len(quest[i])>1:
        push(int(quest[i][1]))
    else:
        if quest[i][0]=='pop':
            print(pop())
        elif quest[i][0]=='size':
            print(size())
        elif quest[i][0]=='empty':
            print(empty())
        elif quest[i][0]=='top':
            print(top())