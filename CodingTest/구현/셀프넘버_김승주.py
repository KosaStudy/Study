nums = set(range(1, 10000))
re_set = set()
for num in nums:
    for n in str(num):
        num += int(n)
    re_set.add(num)

s_nums = nums - re_set
for self_num in sorted(s_nums):
    print(self_num)
