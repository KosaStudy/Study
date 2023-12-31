# Operating System(OS)

## 정의

---

`사전적 의미`

운영체제 또는 오퍼레이팅 시스템(operating system, OS)은 사용자의 하드웨어, 시스템 리소스를 제어하고 프로그램에 대한 일반적 서비스를 지원하는 시스템 소프트웨어이다

**************************************Windows, Linux, UNIX, macOS 등과 같이 컴퓨터를 사용할 수 있도록 환경을 제공하는 시스템 소프트웨어**************************************

## OS의 분류

---

- 임베디드
    
    > 임베디드는 **가볍고, 효율적이며, 설치 공간이 작고, 장치의 요구 사항에 맞게 작동하며, 안정적**으로 설계된다
    > 
- 서버
    
    > Linux, UNIX, Windows, macOS 등
    > 
    
    > 서버 운영체제는 **네트워크 지향적**이며 **가상화**를 지원하고 **확장성** 등의 특징을 갖고 있으며, 컴퓨터 네트워크를 실행하거나 사용자에게 서비스를 제공하는 수단이기에 매우 중요하다.
    > 
- 모바일
    
    > 스마트폰, 태블릿 등의 운영체제이다.
    > 
    
    > Android, iOS, 타이젠, 심비안 등
    > 
- 데스크탑
    
    > Windows, Linux, UNIX, macOS
    > 

## 역할

---

### **1. 프로세스 관리**

- **프로세스:** 실행 중인 프로그램
- **스레드:** 프로세스의 실행 단위
- **스케줄링:** 프로세스 실행 순서 결정
- **동기화:** 프로세스 간 공유 자원 접근 제어
- **IPC 통신:** 프로세스 간 통신

<aside>
💡 운영체제에서 작동하는 응용 프로그램을 관리하는 기능이다.

어떤 의미에서는 프로세서(CPU)를 관리하는 것이라고 볼 수도 있다. 현재 CPU를 점유해야 할 프로세스를 결정하고, 실제로 CPU를 프로세스에 할당하며, 이 프로세스 간 공유 자원 접근과 통신 등을 관리하게 된다.

</aside>

### **2. 저장장치 관리**

- **메모리 관리:** 프로세스에 메모리 할당 및 해제
- **가상 메모리:** 실제 메모리를 효율적으로 사용하기 위한 기술
- **파일 시스템:** 파일의 생성, 삭제, 읽기, 쓰기 등을 관리

<aside>
💡 1차 저장장치에 해당하는 메인 메모리와 2차 저장장치에 해당하는 하드디스크, NAND 등을 관리하는 기능이다.

- 1차 저장장치(Main Memory)
    - 프로세스에 할당하는 메모리 영역의 할당과 해제
    - 각 메모리 영역 간의 침범 방지
    - 메인 메모리의 효율적 활용을 위한 가상 메모리 기능
- 2차 저장장치(HDD, NAND Flash Memory 등)
    - 파일 형식의 데이터 저장
    - 이런 파일 데이터 관리를 위한 파일 시스템을 OS에서 관리
    - `FAT, NTFS, EXT2, JFS, XFS` 등 많은 파일 시스템들이 개발되어 사용 중
</aside>

### **3. 네트워킹**

- **TCP/IP:** 인터넷에서 사용되는 프로토콜
- **기타 프로토콜:** 특정 네트워크에서 사용되는 프로토콜

<aside>
💡 네트워킹은 컴퓨터 활용의 핵심과도 같아졌다.

TCP/IP 기반의 인터넷에 연결하거나, 응용 프로그램이 네트워크를 사용하려면 **운영체제에서 네트워크 프로토콜을 지원**해야 한다. 현재 상용 OS들은 다양하고 많은 네트워크 프로토콜을 지원한다.

이처럼 운영체제는 사용자와 컴퓨터 하드웨어 사이에 위치해서, 하드웨어를 운영 및 관리하고 명령어를 제어하여 응용 프로그램 및 하드웨어를 소프트웨어적으로 제어 및 관리를 해야한다.

*<애플리케이션 레벨에서 지원되는 프로토콜의 기타 종류>*

| 종류 | 설명 |
| --- | --- |
| FTP | 컴퓨터끼리 파일을 전송한다. |
| Telnet | 네트워크 상의 컴퓨터에 접속하여 명령 입력으로 컴퓨터를 조작한다. |
| SMTP | 메일을 전송한다. |
| POP3 | 메일 서버상의 메일 수신함으로부터 메일을 읽어들인다. |
</aside>

### **4. 사용자 관리**

- **계정 관리:** 사용자의 계정 생성, 삭제, 권한 설정 등을 관리
- **접근권한 관리:** 사용자의 파일, 디바이스, 네트워크 등에 대한 접근 권한을 관리

<aside>
💡 우리가 사용하는 PC는 오직 한 사람만의 것일까? 아니다.

하나의 PC로도 여러 사람이 사용하는 경우가 많다. 그래서 운영체제는 한 컴퓨터를 여러 사람이 사용하는 환경도 지원해야 한다. 가족들이 각자의 계정을 만들어 PC를 사용한다면, 이는 하나의 컴퓨터를 여러 명이 사용한다고 말할 수 있다.

따라서, 운영체제는 각 계정을 관리할 수 있는 기능이 필요하다. 사용자 별로 프라이버시와 보안을 위해 개인 파일에 대해선 다른 사용자가 접근할 수 없도록 해야 한다. 이 밖에도 파일이나 시스템 자원에 접근 권한을 지정할 수 있도록 지원하는 것이 사용자 관리 기능이다.

</aside>

### **5. 디바이스 드라이버**

- **순차접근 장치:** 한 번에 한 개의 데이터만 처리할 수 있는 장치
- **임의접근 장치:** 한 번에 여러 개의 데이터를 처리할 수 있는 장치
- **네트워크 장치:** 네트워크를 통해 데이터를 전송하는 장치

<aside>
💡 운영체제는 시스템의 자원, 하드웨어를 관리한다. 시스템에는 여러 하드웨어가 붙어있는데, 이들을 운영체제에서 인식하고 관리하게 만들어 응용 프로그램이 하드웨어를 사용할 수 있게 만들어야 한다.

따라서, 운영체제 안에 하드웨어를 추상화 해주는 계층이 필요하다. 이 계층이 바로 디바이스 드라이버라고 불린다. 하드웨어의 종류가 많은 만큼, 운영체제 내부의 디바이스 드라이버도 많이 존재한다.

이러한 수많은 디바이스 드라이버들을 관리하는 기능 또한 운영체제가 맡고 있다.

</aside>

## OS의 구성요소

---

### **커널(Kernel)**

운영체제 커널이라고 하면, 전반적인 프로세스를 뜻한다. 

프로세스 관리, 메모리 관리, 저장공간 관리, 연결된 장치 관리 등 컴퓨터에 속한 모든 자원을 관리하는 역할을 한다.

### **인터페이스(Interface)**

인터페이스는 사용자의 명령을 컴퓨터에 전달하고 결과를 사용자에게 알려주는 소통의 역할을 한다. 인터페이스는 대표적으로 2가지 종류가 있다. 

- GUI는 윈도우 바탕화면처럼 아이콘과 마우스 클릭이 되게끔 만들어져서 사용자 편의성을 가진 인터페이스다.
- CLI는 터미널로 연결하면, 마우스가 없고 명령어를 키보드로 입력하면 글씨만 나오는 인터페이스다.

### **시스템 콜(System Call)**

시스템 콜은 사용자나 프로그램이 직접적으로 컴퓨터 자원에 접근하는 것을 막고 커널을 보호하기 위해서 만든 코드 집합이다. 

**시스템 콜 함수를 통해 커널에 접근할 수 있다.** 

커널이라는 굉장히 중요한 여러가지 코드나 중요한 내용이 있는데, 그걸 아무나 접근할 수 있게 만들면, 중요한 걸 누가 바꾸거나 할 수 있게 때문에 운영체제는 시스템 콜을 통해서만 호출할 수 있게 디자인 되어있다.

### **드라이버(Driver)**

드라이버는 프린터, 키보드 및 디스크 드라이브와 같은 하드웨어 장치와 운영체제 간의 통신을 가능하게 하는 소프트웨어이다. 몇년 전만해도 컴퓨터에 새로운 기기를 연결하기 위해 드라이버를 설치했어야했던 걸 알고있다면, 이해하기 쉽다. 프린터라고 하는 기계는 컴퓨터가 일반적으로 이해하는 구조랑 좀 다르게 생겼다. 특수한 목적을 가지고 있는 하드웨어이기 떄문이다. 그래서 드라이버를 설치함으로써 그 디바이스와 소통을 할 수 있게 만들어주는 것이다.