package SocketGUIGameProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MainServer {

	public static void main(String[] args) {
		
		RCom r = new RCom();
		
		UserCheck uc = new UserCheck();
		System.out.println(r.com[0]+","+r.com[1]+","+r.com[2]);
		
		try {
			ServerSocket s_socket = new ServerSocket(8088);	//메인서버(8088)소켓 열기
			
			Socket c_socket = s_socket.accept();	//클라이언트 접속
			
			//받은 내용을 읽거나 내보내기 위한  ServerReceiveThread 객체 생성
			ReceiveThread rec_thread = new ReceiveThread();
			
			rec_thread.setSocket(c_socket);	//client 소켓 세팅
			
			rec_thread.setBaseBallNum(r.com);
			
			rec_thread.setUserCheck(uc); //userCheck 객체 세팅
			
			SendThread send_thread = new SendThread();	//입력한 값을 보낼 수 있는 쓰레드
			
			send_thread.setSocket(c_socket); //client가 내용을 보낼 수 있도록 해당 소켓 세팅
			
			 rec_thread.start();
			 send_thread.start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
