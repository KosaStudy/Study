def fibonacci_counts(max_n):
    count_zero = [1, 0] + [0] * (max_n - 1)
    count_one = [0, 1] + [0] * (max_n - 1)

    for i in range(2, max_n + 1):
        count_zero[i] = count_zero[i - 1] + count_zero[i - 2]
        count_one[i] = count_one[i - 1] + count_one[i - 2]

    return count_zero, count_one


T = int(input())
test_cases = [int(input()) for i in range(T)]
max_n = max(test_cases)

count_zeros, count_ones = fibonacci_counts(max_n)

for n in test_cases:
    print(count_zeros[n], count_ones[n])
