n = int(input())
m = int(input())
s = input()

sstr = 'OI'
pattern = 'I' + sstr * n
table = [0 for _ in range(len(pattern))]


def create_kmp_table():
    i = 0
    for j in range(1, len(pattern)):
        while i > 0 and pattern[i] != pattern[j]:
            i = table[i - 1]

        if pattern[i] == pattern[j]:
            i += 1
            table[j] = i


def kmp(sentence, pattern):
    answer = 0
    i = 0

    for j in range(len(sentence)):
        while i > 0 and pattern[i] != sentence[j]:
            i = table[i - 1]

        if pattern[i] == sentence[j]:
            i += 1
            if i == len(pattern):
                answer += 1
                i = table[i - 1]

    return answer


create_kmp_table()
print(kmp(s, pattern))
