# JOIN
- 두 개이상의 테이블이나 데이터베이스를 연결해서 데이터를 검색하는 방법.

<img src="https://hongong.hanbit.co.kr/wp-content/uploads/2021/11/%ED%98%BC%EC%9E%90-%EA%B3%B5%EB%B6%80%ED%95%98%EB%8A%94-SQL_CROSS-JOIN.png" height="300px"/>
## JOIN 종류
### 1. INNER JOIN
- 두 테이블을 조인할 때, 두 테이블에 모두 지정한 열의 데이터가 있어야 한다.
### 2. OUTER JOIN
- 두 테이블을 조인할 때, 1개의 테이블에만 데이터가 있어도 결과가 나온다.

  ### 2-1. LEFT OUTER JOIN:
  - 왼쪽 테이블의 모든 값이 출력되는 조인
  
  ### 2-2. RIGHT OUTER JOIN:
  - 오른쪽 테이블의 모든 값이 출력되는 조인
  
  ### 2-3. FULL OUTER JOIN:
  - 왼쪽 또는 오른쪽 테이블의 모든 값이 출력되는 조인
    
### 3.CROSS JOIN
- 한쪽 테이블의 모든 행과 다른 쪽 테이블의 모든 행을 조인
- 상호 조인 결과의 전체 행 개수는 두 테이블의 각 행의 개수를 곱한 수만큼 된다 = 카티션 곱(CARTESIAN PRODUCT)
  
### 4.SELF JOIN
- 자신이 자신과 조인한다는 의미로, 1개의 테이블을 사용
