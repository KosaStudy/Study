T = int(input())
answer=[]
DP0=[1,0]
DP1=[0,1]

for i in range(2,41):
  DP0.append(DP0[i-1]+DP0[i-2])
  DP1.append(DP1[i-1]+DP1[i-2])

for _ in range(T):
  N = int(input())
  answer.append((DP0[N],DP1[N]))

for i in answer:
  print(i[0],i[1])