original = input()
split_ = original.split('-')

answer=0
result = sum(map(int,(split_[0].split('+'))))

if original[0]=='-':
  answer-=result
else:
  answer+=result

for i in split_[1:]:
  i=sum(map(int,(i.split('+'))))
  answer-=i

print(answer)