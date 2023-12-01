"""
note 
- 조건에 만족하는 가장 좋은 경우를 골라 결과가 최대의 경우 -> greedy 
- 각 회의를 시작 시간, 끝나는 시간 순으로 정렬
- 합했을 때로 넘어가면 됨. 

input 설정 안하면..시간초과..
"""
import sys

input = sys.stdin.readline

n = int(input())

meetings = []
for _ in range(n):
    s, f = map(int, input().split())
    meetings.append((s, f))

meetings.sort(key=lambda x: (x[1], x[0]))  # 끝나는 시간, 시작 순으로 정렬

time = 0
count = 0
for meet in meetings:
    s, f = meet[0], meet[1]
    if s >= time:
        count += 1
        time = f
print(count)
