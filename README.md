<h1>⚾JavaSocket_BaseballGame⚾</h1>
<p>Server와 Client를 Socket을 통해 연결하여 숫자야구 게임을 진행</p><br><br>

<h2>portfolio</h2>
[자바_포트폴리오(이정운).pdf](https://github.com/Durumibird12/JavaSocket_BaseballGame/files/14723183/_.pdf)
<br>

<div>
  <h2>Mechanism</h2>
  <h3>Server</h3>
  <ol type="1">
    <li>ServerSocket 생성</li>
    <li>접속 accept()접속 대기</li>
    <li>Client와 통신을 위한 Socket반환</li>
    <li>접속 accept()접속 대기</li>
    <li>생성된 Socket을 통해 BufferedReader와 PrintWriter 생성</li>
    <li>생성된 Stream을 통해 데이터 송수신</li>
  </ol>
  
  <h3>Client</h3>
  <ol type="1">
    <li>rSocket 생성 및 접속</li>
    <li>생성된 Socket을 통해 BufferedReader와 PrintWriter 생성</li>
    <li>생성된 Stream을 통해 데이터 송수신</li>
  </ol>
</div><br>

![Mechanism](https://github.com/Durumibird12/JavaSocket_BaseballGame/assets/142339302/c6db8723-18d2-4bcd-bba2-47547ccd9d55)

<br>
<div>
  <h2>How to play?</h2>
  <ul>
    <li>MainServer실행 후 MainClient실행</li>
    <li>야구판 GUI가 화면에 나타나면 접속성공!</li>
  </ul>
</div><br>

![Success](https://github.com/Durumibird12/JavaSocket_BaseballGame/assets/142339302/a662eb96-8057-42e7-85aa-7c530dbaca06)

