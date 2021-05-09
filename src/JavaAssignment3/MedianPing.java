package JavaAssignment3;

import java.net.*;
import java.io.*;

public class MedianPing {
	public void pingRequest(String ipAddress) throws UnknownHostException, IOException{
		long presentTime = System.currentTimeMillis();
		InetAddress address = InetAddress.getByName(ipAddress);
		System.out.println("Sending Ping Request to "+ ipAddress);
		if(address.isReachable(2000)) {
			System.out.println("Host is Reachable.");
		}
		else {
			System.out.println("Host is not Reachable.");
		}
		presentTime = System.currentTimeMillis() - presentTime;
		System.out.println("Time taken to ping the host: "+ ipAddress + " is " + presentTime + " milliseconds.");
	}
	public static void main(String args[]) throws UnknownHostException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ipAddress = br.readLine();
		MedianPing mp = new MedianPing();
		mp.pingRequest(ipAddress);
	}
}
