from collections import defaultdict

N = int(input())
count=0

for _ in range(N):
  word = input()
  dic=defaultdict(int)
  for i in range(len(word)):
    if i==len(word)-1:
      dic[word[i]]+=1
      break
    if word[i]!=word[i+1]:
      dic[word[i]]+=1
  
  

  for i in dic:
    if dic[i]>1:
      break
  else:
    count+=1

print(count)