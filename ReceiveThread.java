package SocketGUIGameProject;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ReceiveThread extends Thread{
	
	private Socket m_Socket;
	
	private int[] com;
	private UserCheck uc; //strike, ball, out 갯수 확인용
	
	public void run() {
		super.run();
		
		try {	
			BufferedReader tmpbuf = new BufferedReader(
					new InputStreamReader(m_Socket.getInputStream()));
			// Socket을 이용한 BufferReader 생성
			PrintWriter sendWriter = new PrintWriter(m_Socket.getOutputStream());
			String receiveString;			
			while(true) {
				receiveString = tmpbuf.readLine();
				// BufferReader ReadLine 저장
				System.out.println(receiveString);
				if(receiveString == null) {	//보내온 값이 없을 시
					System.out.println("상대방 연결이 끊겼습니다.");
					break;
				} else {	//보내 온 내용이 있을 시 아래 수행
					System.out.println(receiveString);
					int num1 = receiveString.charAt(0)-'0';
					int num2 = receiveString.charAt(1)-'0';
					int num3 = receiveString.charAt(2)-'0';
					
					int[] user = {num1, num2, num3};
					uc.check(user, com);
					//strike, ball, out의 갯수를 체크해서 uc내에 저장해둠
					
					sendWriter.println(uc.getResult());
					sendWriter.flush();
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.exit(0); //답을 맞췄을 시 프로그램 종료
	}
	
	public void setSocket(Socket _socket) {
		m_Socket = _socket;	//매개변수로 준 소켓 저장
	}
	public void setBaseBallNum(int[] _com) {
		this.com = _com;	//매개변수로 준 배열 저장
	}
	public void setUserCheck(UserCheck _uc) {
		this.uc = _uc;	//매개변수로 준 UserCheck 객체 저장
	}
}
