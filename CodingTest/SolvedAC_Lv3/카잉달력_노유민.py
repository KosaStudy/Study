T = int(input())

for _ in range(T):
  M,N,X,Y = map(int,input().split())

  target = X
  
  while target <=M*N:
    if (target-X) % M ==0 and (target-Y) % N ==0:
      print(target)
      break
    
    target+=M

  else:
    print(-1)