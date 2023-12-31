# B Tree 정의
## B-Tree와 B+Tree는 데이터를 정렬하고, 빠른 검색, 삽입, 삭제를 위해 설계된 대규모 데이터베이스와 파일 시스템에서 사용되는 색인 구조

# B-Tree
## 정의

 B-Tree는 균형 잡힌 트리 데이터 구조로, 노드가 많은 자식을 가질 수 있게 확장된 이진 트리임.
 각 노드는 여러 키를 가지며, 키의 수에 따라 자식 노드의 수가 결정

## 장점

 균형 잡힌 트리이므로 검색, 삽입, 삭제 연산이 항상 일정한 시간 복잡도를 유지함(O(log n)).
 노드 내부의 키가 정렬되어 있어 중위 순회로 정렬된 데이터가 나옴.

## 단점

 노드 내 데이터와 자식 포인터가 함께 있어 데이터 스토리지 공간이 더 클 수 있음.
 삭제 또는 삽입 시 노드 분할이나 병합이 복잡

# B+Tree
## 정의

 B+Tree는 B-Tree의 변형으로, 모든 값을 리프 노드에 저장하고, 내부 노드는 검색과 인덱스에만 사용함.

## 장점

 리프 노드가 링크드 리스트로 연결되어 있어 범위 검색과 순차 접근이 용이함.
 모든 리프 노드가 같은 레벨에 있어 검색 시간이 더 균일함.

## 단점

 B-Tree에 비해 삽입과 삭제가 더 복잡함.
 리프 노드만 데이터를 저장하므로, 더 많은 I/O가 필요할 수 있음.
