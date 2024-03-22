<h1>JavaSocket_BaseballGame</h1>
<p>Server와 Client를 Socket을 통해 연결하여 숫자야구 게임을 진행</p>

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
</div>


