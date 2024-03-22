package SocketGUIGameProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class BaseBallPanel extends JPanel{
	
	JTextField jt;
	int strike = 0;
	int ball = 0;
	int out = 0;

	void setData(int strike, int ball, int out) {
		//정수값 3개 리턴받는 함수
		this.strike = strike;
		this.ball = ball;
		this.out = out;
	}

	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);	//paintComponent에 g를 대입해서 호출
		g.setFont(new Font("맑음 고딕",Font.BOLD,20));

		if(strike == 3) {
			//strike의 값이 3이면 아래의 명령 실행
			
			g.setFont(new Font("맑음고딕",Font.BOLD,60));
			//Font를 생성할때 "맑은 고딕"과 BOLD(굵기) 사이즈는 60
			g.drawString("Home Run!", 30, 180);
			//"Home Run!"이라는 문장을 x:30, y:180 위치에 문자열을 그림
		} else {
			//위 조건에 부합하지 않을 시(strike의 값이 3이 아닐 시) 아래 명령 실행
			
			if(strike == 0)	{
				//변수 strike가 0이면 아래 명령 실행
				
				g.setColor(Color.RED);
				//컬러는 레드
				g.drawString("S", 30, 222);
				//"S"를 x:30, y:222 위치에 문자열을 그림
				g.drawOval(50,200,30,30);
				//비워 있는 원을 x:50, y:200 위치에 30사이즈로 그림
				g.drawOval(90,200,30,30);
				//비워 있는 원을 x:90, y:200에 30사이즈로 그림
			} else if(strike == 1) {
				//변수 strike가 1이면 아래 명령어 실행

				g.setColor(Color.RED);
				//컬러는 레드
				g.drawString("S", 30, 222);
				//"S"를 x:30, y:222 위치에 문자열을 그림
				g.fillOval(50,200,30,30);
				//비워 있는 원을 x:50, y:200 위치에 30사이즈로 그림
				g.drawOval(90,200,30,30);
				//비워 있는 원을 x:90, y:200에 30사이즈로 그림
			} else {
				//위의 두조건이 모두 아니면 아래 명령어 실행
			
				g.setColor(Color.RED);
				//컬러는 레드
				g.drawString("S", 30, 222);
				//"S"를 x:30, y:222 위치에 문자열을 그림
				g.fillOval(50,200,30,30);
				//비워 있는 원을 x:50, y:200 위치에 30사이즈로 그림
				g.fillOval(90,200,30,30);
				//비워 있는 원을 x:90, y:200에 30사이즈로 그림
			}
			
			if(ball == 0) {
				//변수 ball이 0이면 아래 명령어 실행
			
				g.setColor(Color.BLUE);
				//컬러는 블루
				g.drawString("B", 30, 262);
				//"B"를 x:30, y:262위치에 문자열을 그림
				g.drawOval(50,240,30,30);
				//비워 있는 원을 x:50, y:240위치에 30사이즈로 그림
				g.drawOval(90,240,30,30);
				//비워 있는 원을 x:90, y:240위치에 30사이즈로 그림
				g.drawOval(130,240,30,30);
				//비워 있는 원을 x:130, y:240위치에 30사이즈로 그림
			} else if(ball == 1) {
				g.setColor(Color.BLUE);
				//컬러는 블루
				g.drawString("B", 30, 262);
				//"B"를 x:30, y:262위치에 문자열을 그림
				g.fillOval(50,240,30,30);
				//비워 있는 원을 x:50, y:240위치에 30사이즈로 그림
				g.drawOval(90,240,30,30);
				//비워 있는 원을 x:90, y:240위치에 30사이즈로 그림
				g.drawOval(130,240,30,30);
				//비워 있는 원을 x:130, y:240위치에 30사이즈로 그림
			} else if(ball == 2) {
				g.setColor(Color.BLUE);
				//컬러는 블루
				g.drawString("B", 30, 262);
				//"B"를 x:30, y:262위치에 문자열을 그림
				g.fillOval(50,240,30,30);
				//비워 있는 원을 x:50, y:240위치에 30사이즈로 그림
				g.fillOval(90,240,30,30);
				//비워 있는 원을 x:90, y:240위치에 30사이즈로 그림
				g.drawOval(130,240,30,30);
				//비워 있는 원을 x:130, y:240위치에 30사이즈로 그림
			} else {
				g.setColor(Color.BLUE);
				//컬러는 블루
				g.drawString("B", 30, 262);
				//"B"를 x:30, y:262위치에 문자열을 그림
				g.fillOval(50,240,30,30);
				//비워 있는 원을 x:50, y:240위치에 30사이즈로 그림
				g.fillOval(90,240,30,30);
				//비워 있는 원을 x:90, y:240위치에 30사이즈로 그림
				g.fillOval(130,240,30,30);
				//비워 있는 원을 x:130, y:240위치에 30사이즈로 그림
			}

			if(out == 0) {
				g.setColor(Color.ORANGE);
				//컬러는 오렌지
				g.drawString("O", 30, 302);
				//"O"를 x:30, y:302위치에 문자열을 그림
				g.drawOval(50,280,30,30);
				//비워 있는 원을 x:50, y:280위치에 30사이즈로 그림
			} else {
				//위에 조건이 아니면 아래 명령어 실행
				g.setColor(Color.ORANGE);
				//컬러는 오렌지
				g.drawString("O", 30, 302);
				//"O"를 x:30, y:302위치에 문자열을 그림
				g.fillOval(50,280,30,30);
				//비워 있는 원을 x:50, y:280위치에 30사이즈로 그림
			}
		}
	}
}
