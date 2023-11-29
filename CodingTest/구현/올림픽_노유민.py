N,K = map(int,input().split())

li=[]
for _ in range(N):
  li.append(list(map(int,input().split())))

li.sort(key=lambda x: (x[1],x[2],x[3]),reverse=True)

idx= [li[i][0] for i in range(N)].index(K)

for i in range(N):
  if li[idx][1:] == li[i][1:]:
    print(i+1)
    break
