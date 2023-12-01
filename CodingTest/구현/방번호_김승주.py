from collections import Counter

n = dict(Counter(input()))

n["6"] = (n.get("6", 0) + n.get("9", 0) + 1) // 2
n["9"] = 0
print(max(n.values()))
