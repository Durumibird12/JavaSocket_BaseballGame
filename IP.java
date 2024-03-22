package SocketGUIGameProject;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());

	}

}
