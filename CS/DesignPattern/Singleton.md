# 싱글톤 패턴 (Singleton Pattern)

### 싱글톤 패턴이란?
애플리케이션이 시작될 때, 어떤 클래스가 최초 한 번만 메모리를 할당(static)하고 해당 메모리에 인스턴스를 만들어 사용하는 패턴

| '하나'의 인스턴스만 생성하여 사용하는 디자인 패턴!

생성자가 여러번 호출되어도 실제로 생성되는 객체는 하나이며, 최초로 생성된 이후에 호출된 생성자는 이미 생성한 객체를 반환시키도록 만듦

### 사용 방법
``` java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
java에서는 생성자를 private으로 선언해 다른 곳에서 생성하지 못하도록 만들고, getInstance() 메소드를 통해 받아서 사용하도록 구현

### 사용하는 이유
- 객체 생성이 한 번만 이루어지므로 메모리 낭비를 방지할 수 있음
- 전역이므로 다른 클래스의 인스턴스들이 데이터를 공유할 수 있음

### 주로 사용되는 상황
- 공통된 객체를 여러개 생성해서 사용해야하는 상황
  - 데이터베이스에서 커넥션풀, 스레드풀, 캐시, 로그 기록 객체 등
- 안드로이드 앱 : 각 액티비티들이나 클래스마다 주요 클래스들을 하나하나 전달하는 것이 번거롭기 때문에 싱글톤 클래스를 만들어 어디서든 접근하도록 설계
- 인스턴스가 절대적으로 하나만 존재하는 것을 보증하고 싶을 때 사용

### 단점
- 싱글톤 인스턴스가 혼자 너무 많은 일을 하거나, 많은 데이터를 공유시키면 다른 클래스들 간의 결합도가 높아지면서 개방-폐쇄 원칙이 위배됨
- 결합도가 높아지게 되면, 유지보수가 힘들고 테스트도 원활하게 진행할 수 없는 문제점 발생
- 멀티 스레드 환경에서 동기화 처리를 하지 않았을 때, 인스턴스가 2개가 생성되는 문제 발생

### 결론
반드시 싱글톤이 필요한 상황이 아니면 지양하는 것이 좋음
(설계 자체에서 싱글톤 활용을 원활하게 할 자신이 있으면 괜찮음)


