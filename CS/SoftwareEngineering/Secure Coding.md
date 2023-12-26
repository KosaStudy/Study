# 시큐어 코딩

### 시큐어 코딩이란?
안전한 소프트웨어를 개발하기 위해, 소스코드 등에 존재할 수 있는 잠재적인 보안약점을 제거하는 것
<br>

#### 보안 약점 사례
- SQL 인젝션
- URL 파라미터 조작
- 무작위 대입 공격

### SQL 인젝션

- 안전하지 않은 코드
```
String query "SELECT * FROM users WHERE userid = '" + userid + "'" + "AND password = '" + password + "'";
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery(query);
```

<br>

- 안전한 코드

```
String query "SELECT * FROM users WHERE userid = ? AND password = ?";

PrepareStatement stmt = connection.prepareStatement(query);
stmt.setString(1, userid);
stmt.setString(2, password);
ResultSet rs = stmt.executeQuery();
```

적절한 검증 작업이 수행되어야 안전함

<br>
입력받는 값의 변수를 `$` 대신 `#`을 사용하면서 바인딩 처리로 시큐어 코딩이 가능하다.
<br>

### 파라미터 조작
- 대응 기법
1. Controller나 Service 컴포넌트에서 if문을 이용한 요청 유효성 검사 <br>
   일반 사용자인 경우 반드시 세션에 저장된 사용자 ID와 조회 요청을 위해 전달된 파라미터 사용자 ID 값이 같은지 확인하는 코드를 추가함

2. Spring MVC 프레임워크 사용시 입력값 검증 <br>
   Validator, Model 컴포넌트에서 Annotation 설정으로 유효성 점검
