word = input()
count=0
dic=['c=','c-','dz=','d-','lj','nj','s=','z=']
i=0
while i<len(word):
  if word[i:i+3] in dic:
    count+=1
    i+=3
  elif word[i:i+2] in dic:
    count+=1
    i+=2
  else:
    count+=1
    i+=1

print(count)