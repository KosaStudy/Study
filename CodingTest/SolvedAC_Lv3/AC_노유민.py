from collections import deque
T = int(input())


for _ in range(T):
  order=list(input())
  Dcount = order.count('D')
  N = int(input())
  li = deque(input()[1:-1].split(","))

  if Dcount>N:
    print('error')
    continue

  Rcount=0
  for i in order:
    if i=='R':
      Rcount+=1
    if i=='D':
      if Rcount%2==0:
        li.popleft()
      else:
        li.pop()

  if Rcount%2==0:
    print('['+",".join(li)+']')
  else:
    li.reverse()
    print('['+",".join(li)+']')