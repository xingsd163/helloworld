package SocketOperations;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class GreetingClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InetAddress inet = null;
		try {
			inet = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());
		System.out.println(inet.getLoopbackAddress());
		System.out.println(inet.getAddress());
		
		Socket client = null;
		
		try {
			client = new Socket(inet,9987);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
