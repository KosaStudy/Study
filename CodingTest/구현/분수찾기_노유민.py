N=int(input())

line=1

while N>line:
  N-=line
  line+=1

if line%2==0:
  x = N
  y = line-N+1
else:
  x = line-N+1
  y = N
print(str(x)+'/'+str(y))