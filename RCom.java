package SocketGUIGameProject;

import java.util.Random;

public class RCom {
	
	int[] com;	
	
	public RCom(){
		Random r = new Random();
		
		com = new int[3];	//변수 com에 정수형 배열 객체 생성 후 대입

		for(int i = 0;i<com.length;i++) {	//com의 인덱스들이 겹치지 않게
			com[i] = r.nextInt(9)+1;
			for(int j = 0;j<i;j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}

	public int[] getCom() {	//정수형 배열을 리턴하고 아무것도 받지않은 getCom이라는 함수
		
		return com;	//변수 com을 리턴
		
	}
}
