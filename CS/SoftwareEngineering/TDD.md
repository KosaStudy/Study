# TDD (Test Driven Development)

## 요약

### 테스트가 개발을 이끌어 나간다.


<img src="https://camo.githubusercontent.com/f014f3b5265f830d23a9c14229e5268ecd19f18be4e8780f5754ad2fe710c2fd/68747470733a2f2f6d626c6f677468756d622d7068696e662e707374617469632e6e65742f4d6a41784e7a41324d6a68664d5455302f4d4441784e446b344e6a41324e5441794e6a55322e7a4b4768355a755967546f547a3670316c57674d435f58623330693775553836596830304e325872704d77672e3862335839634353365f696a7a577958456951466f6d6273574d314a38466c55394c6851326a306e616e6f672e504e472e73757265736f6674746563682f696d6167652e706e673f747970653d77383030">

보통 개발할 때 위의 그림처럼, 설계를 한 이후 코드 개발과 테스트 과정을 거치게 된다.

하지만 TDD는 아래의 그림과 같이 테스트케이스를 먼저 작성한 이후에 실제 코드를 개발하는 리팩토링 절차를 밟는다.

<img src="https://camo.githubusercontent.com/07390e1aaff7c137eb2723284d7e17628ae26445f48c4384e4a30950b61b6eee/68747470733a2f2f6d626c6f677468756d622d7068696e662e707374617469632e6e65742f4d6a41784e7a41324d6a68664d6a45332f4d4441784e446b344e6a41324e5445784e4467772e667038584639795f5f4b7a37356e3836786b6e495044746854486a3961385130386f63494a49714d523641672e32346a4a615f385f5430516a3034503632465a6263687174386f544e584746534c5549747a4d5039357338672e504e472e73757265736f6674746563682f696d6167652e706e673f747970653d77383030">

#### TDD 장점
1. 작업과 동시에 테스트를 진행하기 때문에 실시간으로 오류 파악이 가능함
2. 짧은 개발 주기를 통해 고객의 요구사항을 빠르게 반영할 수 있기 때문에 진행 상황 파악이 쉬움
3. 자동화 도구를 이용한 TDD 테스트케이스를 단위 테스트로 사용이 가능함
4. 자바는 JUnit이 있고 테스트 코드에 대한 것을 문서로도 확인할 수 있음
   

#### TDD 단점
1. 테스트 케이스 설계 및 작성을 해야하기 때문에 생산 비용이 증가한다.
2. 테스트의 방향성, 프로젝트 성격에 따른 테스트 프레임워크 선택 등 추가로 고려할 부분의 증가함

---

## TDD 예제
중간고사, 기말고사, 과제 점수를 통한 성적을 내는 간단한 프로그램

점수 총합 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D, 나머지는 F

```java
public class GradeTest {
    
    @Test
    public void scoreResult() {
        
        //given
        Score score = new Score(35, 25, 25); // Score 클래스 생성
        SimpleScoreStrategy scores = new SimpleScoreStrategy();
        
        //when
        String resultGrade = scores.computeGrade(score); // 점수 계산
        
        //then
        assertEquals("B", resultGrade); // 확인
    }
}
```

<br>
현재는 Score 클래스와 computeGrade()메소드가 구현되지 않은 상태이므로 Score 클래스와 SimpleScoreStrategy를 만들어야 한다.

```java
public class Score {
    
    private int middleScore = 0;
    private int finalScore = 0;
    private int homeworkScore = 0;
    
    public Score(int middleScore, int finalScore, int homeworkScore) {
        this.middleScore = middleScore;
        this.finalScore = finalScore;
        this.homeworkScore = homeworkScore;
    }
    
    public int getMiddleScore(){
        return middleScore;
    }
    
    public int getFinalScore(){
        return finalScore;
    }
    
    public int getHomeworkScore(){
        return homeworkScore;
    }
    
}

public class SimpleScoreStrategy {
    
    public String computeGrade(Score score) {
        
        int totalScore = score.getMiddleScore() + score.getFinalScore() + score.getHomeworkScore(); // 점수 총합
        
        String gradeResult = null; // 학점 저장할 String 변수
        
        if(totalScore >= 90) {
            gradeResult = "A";
        } else if(totalScore >= 80) {
            gradeResult = "B";
        } else if(totalScore >= 70) {
            gradeResult = "C";
        } else if(totalScore >= 60) {
            gradeResult = "D";
        } else {
            gradeResult = "F";
        }
        
        return gradeResult;
    }
    
}

```

원래는 interface를 만들어 implements하여 구현해야 하지만 간단하게 하기 위해 생략했습니다.

테스트 코드가 처음에는 복잡하고 귀찮긴 하지만 프로젝트가 커질수록 좋다고 하니 시간 남으면 하나씩 연습하면 좋을 것 같습니다.