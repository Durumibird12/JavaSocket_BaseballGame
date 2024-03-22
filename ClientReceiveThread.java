package SocketGUIGameProject;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClientReceiveThread extends JFrame implements ActionListener, Runnable{
	
	private Socket m_Socket;
	
	BaseBallPanel bp;
	JTextField jt;
	JButton jb;
	
	public ClientReceiveThread() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		//Container에 setLayout함수 호출 인자로 BorderLayout 객체를 생성해서 넘김
		bp = new BaseBallPanel();
		jt = new JTextField(15);
		bp.add(jt);
		
		jb = new JButton("입력");
		jb.addActionListener(this);
		//JButton에 addActionListener 함수를 호출, 현재 클래스 자신을 대입해서 호출
		jb.setFont(new Font("맑음 고딕", Font.BOLD,20));
		bp.add(jb);
		
		c.add(bp);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void run() {
		try{
			BufferedReader tmpbuf = 
			new BufferedReader(new InputStreamReader(m_Socket.getInputStream()));
			String receiveString;
			while(true) {
				receiveString = tmpbuf.readLine();
				System.out.println(receiveString);
				
				if(receiveString == null) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println(receiveString);
					bp.setData(receiveString.charAt(0)-'0', 
							receiveString.charAt(1)-'0', 
							receiveString.charAt(2)-'0');
					bp.repaint();
				}	
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	public void setSocket(Socket _socket) {
		m_Socket = _socket;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PrintWriter sendWriter = null;
		try {
			sendWriter = new PrintWriter(m_Socket.getOutputStream());
		} catch(IOException e1){
			e1.printStackTrace();
		}
		sendWriter.println(jt.getText());
		sendWriter.flush();
	}

}
