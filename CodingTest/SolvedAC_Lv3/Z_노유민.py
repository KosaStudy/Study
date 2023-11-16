N,r,c = map(int,input().split())

#좌표가 2배 늘어나면 값이 4배 됨
#딱 두배가 안될때도 있으니 나누기 2로 나누고 남은 값은 더해주기

def Z(N,r,c):
  if N==0:
    return 0
  
  return 2*(r%2)+(c%2)+4*Z(N-1,r//2,c//2)

print(Z(N,r,c))