# Tree
- 그래프(graph)의 한 형태로서, 순환(cycle)이 없는 연결 그래프
- 노드(Node): 트리를 구성하는 기본 요소, 값(key or data)과 하위 노드를 가리키는 포인터(pointer)를 가진다.
- 간선(Edge): 노드와 노드를 연결한 선 (link)

<br>

## ⭐️ 그래프와 트리의 차이 ⭐️ 
사이클의 유무

### 트리(Tree)
- 사이클이 없다. 즉, 어떤 노드에서 출발해도 같은 노드로 돌아오는 경로가 존재하지 않는다.
- 모든 노드는 자료형으로 표현이 가능하다.
- 루트에서 한 노드로 가는 경로는 유일한 경로 뿐이다.
- 노드의 개수가 N개일 때, 간선의 수는 N−1개이다.
  
### 그래프(Graph)
- 사이클(Cycle)이 있다.
- 노드 간에 다양한 경로가 존재할 수 있다.


## 트리 순회 방식
<br>
트리를 순회하는 방식은 총 4가지가 있다.
<img src="https://www.geeksforgeeks.org/wp-content/uploads/binary-tree-to-DLL.png">
<br>

1. #### 전위 순회(pre-order)

   각 부모 노드를 순차적으로 먼저 방문하는 방식이다.

   (부모 → 왼쪽 자식 → 오른쪽 자식)

   > 1 → 2 → 4 → 8 → 9 → 5 → 10 → 11 → 3 → 6 → 13 → 7 → 14
   <br>

2. #### 중위 순회(in-order)

   왼쪽 하위 트리를 방문 후 부모 노드를 방문하는 방식이다.

   (왼쪽 자식 → 부모 → 오른쪽 자식)

   > 8 → 4 → 9 → 2 → 10 → 5 → 11 → 1 → 6 → 13 → 3 →14 → 7

   <br>

3. #### 후위 순회(post-order)

   왼쪽 하위 트리부터 하위를 모두 방문 후 부모 노드를 방문하는 방식이다.

   (왼쪽 자식 → 오른쪽 자식 → 부모)

   > 8 → 9 → 4 → 10 → 11 → 5 → 2 → 13 → 6 → 14 → 7 → 3 → 1

   <br>

4. #### 레벨 순회(level-order)

   부모 노드부터 계층 별로 방문하는 방식이다.

   > 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 13 → 14