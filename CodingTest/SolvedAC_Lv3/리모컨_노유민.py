N=int(input())
M=int(input())
if M:
  broken = list(input().split())
else:
  broken=[]

min_value=abs(100-N)

for i in range(1000001):
  for j in str(i):
    if j in broken:
      break
  #break되지 않은 경우에만 min_value값 최신화
  else:
    min_value=min(min_value,abs(i-N)+len(str(i)))

print(min_value)