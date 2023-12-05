# HTTP와 HTTPS란?

- HTTP와 HTTPS는 웹 페이지를 브라우저로 전송하는데 사용되는 프로토콜
- 두 프로토콜의 주요 차이점은 "보안"에 있음

# HTTP(HyperText Transfer Protocol)

### 비암호화

- HTTP는 데이터를 암호화하지 않고 전송함
- 이 때문에 누군가 네트워크에서 신호를 가로채면 내용이 노출되는 보안 이슈가 존재 -> 이 문제를 해결해주는 것이 HTTPS

### 포트 80

- HTTP는 기본적으로 80번 포트를 사용함

### 빠른 연결 설정

- HTTPS보다 연결 설정이 빠르지만 데이터 전송 중 보안이 보장되지 않음


# HTTPS(HyperText Transfer Protocol Secure)

### SSL/TLS 암호

- HTTPS는 SSL (Secure Sockets Layer) 또는 TLS (Transport Layer Security) 프로토콜을 사용하여 데이터를 암호화함
- 이로 인해 데이터가 가로채지거나 수정되는 것을 방지할 수 있음

### 포트 443

- HTTPS는 기본적으로 443번 포트를 사용함

### 보안 인증서

- 웹사이트는 SSL/TLS 인증서를 가져야 하며 이 인증서는 신뢰할 수 있는 기관에 의해 발급되어야 함
- 이를 통해 사용자는 웹사이트가 신뢰할 수 있는지 확인할 수 있음

### 다소 느린 연결 설정

- HTTPS는 암호화와 인증 과정으로 인해 HTTP보다 연결 설정이 느림
- 하지만 현대 기술과 인터넷 속도의 발전으로 이 차이는 갈수록 줄어들고 있음
