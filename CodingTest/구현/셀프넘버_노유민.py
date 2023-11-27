def Cal(num):
  num = num +sum(map(int,str(num)))
  return num

possible=set()

for i in range(1,10000):
  possible.add(Cal(i))

for i in range(1,10000):
  if i not in possible:
    print(i)