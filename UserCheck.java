package SocketGUIGameProject;

public class UserCheck {
	int strike;
	int ball;
	int out;

	public void check(int[] com, int[] user){
		
		strike = 0;
		ball = 0;
		out = 0;
		for(int i =0;i<user.length;i++) {
			for(int j = 0;j<com.length;j++) {
				if(user[i] == com[j]) { 
					//user의 i번째 인덱스와 com의 j번째 인덱스가 같다면 
		
					if(i == j) {	//strike를 1 증가
						strike++;
					}
					else {	//ball을 1 증가
						ball++;
					}
				}
			}
		}
		if(strike == 0 && ball == 0) {
			out = 1;
		}
		
	}
	
	public String getResult() {
		System.out.println(strike+","+ball+","+out);
		return strike+""+ball+""+out;
	}

}
