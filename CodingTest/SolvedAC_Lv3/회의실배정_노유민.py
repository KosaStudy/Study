N= int(input())

li=[]
count=1
for _ in range(N):
  a,b = map(int,input().split())
  li.append((a,b))

li.sort(key=lambda x:(x[1],x[0]) )

start=li[0][0]
end=li[0][1]
for i in range(1,len(li)):
  a,b = li[i]
  if a<end:
    continue
  else:
    count+=1
    start = a
    end=b

print(count)
