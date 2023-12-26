# 최장증가수열

## 요약

### 원소가 n개인 배열의 일부 원소를 골라내서 만든 부분 수열 중, 각 원소가 이전 원소보다 크다는 조건을 만족하고, 그 길이가 최대인 부분 수열을 최장 증가 수열이라고 함

---

### 예를 들어, {6,2,5,1,7,4,8,3} 이라는 배열이 있을 경우, LIS는  {2,5,7,8} 이 된다.

### 일반적으로 최장증가부분 수열의 길이를 푸는 방법은 DP를 이용

```
for (int k = 0; k < n; k++){
	length[k] = 1;
    for (int i = 0; i < k; i++){
        if(arr[i] < arr[k]){
            length[k] = max(length[k], length[i] + 1);
        }
    }
}
```

### 하지만 DP로 풀게 될 경우 시간복잡도가 O(N^2)
### 처음부터 전부 비교하면서 모둔 원소를 순회하기 때문

### 이 경우 N의 크기가 10만이 넘으면 사용할 수 없음
---
### 시간복잡도가 O(NlogN)으로 할수 있는 방법이 Lower Bound인 이분탐색을 활용한 LIS를 구현해야함

```
from bisect import bisect_left

def get_lis_improved(sequence):
  L = [sequence[0]]
  for i in range(1, len(sequence)):
    if L[-1] < sequence[i]:
      L.append(sequence[i])
    else:
      lower_bound = bisect_left(L, sequence[i])
      L[lower_bound] = sequence[i]
  # print(L)
  return len(L)

sequence = [2, 3, 6, 8, 1, 4, 4, 9] # L = [1, 3, 4, 8, 9]
print(get_lis_improved(sequence)) # 5 출력
```

### 이 방법은 두가지로 진행
### 1. 새로운 리스트 L 이 비어있거나 현재 L의 마지막 원소보다 i번째 원소가 큰 경우
### 2. 그렇지 앟는 경우

### 1번의 경우 그냥 L의 뒤에 원소를 추가해주면 됨(점점 증가하는 수열이 됨)
### 2번의 경우 L리스트에서 i번째 원소의 lower bound를 찾아서 그 자리를 i번쨰 원소를 바꿔준다