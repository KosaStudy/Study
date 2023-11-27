from collections import defaultdict
N= input()

dic=defaultdict(int)

for i in N:
  if i=='6' or i=='9':
    dic[6]+=1
  else:
    dic[i]+=1

dic[6]=dic[6]//2+dic[6]%2

print(max(dic.values()))
