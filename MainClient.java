package SocketGUIGameProject;

import java.io.IOException;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ip 주소확인: 윈도우키 -> cmd -> ipconfig입력
			Socket c_socket = new Socket("192.168.0.17", 8088);
			ClientReceiveThread rec_thread = new ClientReceiveThread();
			rec_thread.setSocket(c_socket);
			Thread t = new Thread(rec_thread);
			t.start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}




