N,score, P = map(int,input().split())

if N==0:
  print(1)
else:
  rank = list(map(int,input().split()))
  if N == P and rank[-1] >= score:
    print(-1)
  else:
    result = N+1
    for i in range(N):
      if rank[i] <= score:
        result = i+1
        break
    print(result)