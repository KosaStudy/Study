n = str(input())
m = n.split("-")

x = sum(map(int, (m[0].split("+"))))
answer = 0

if n[0] == "-":
    answer -= x
else:
    answer += x

for x in m[1:]:
    x = sum(map(int, (x.split("+"))))
    answer -= x
print(answer)
