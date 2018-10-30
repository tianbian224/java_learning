package tcp_udp.UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPClient
{

	public static void main(String[] args) throws Exception, UnknownHostException
	{
		byte[] buffer = "shenmegui".getBytes();
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 12345);
		DatagramSocket socket = new DatagramSocket(45689, InetAddress.getLocalHost());
		socket.send(packet);
		socket.close();
	}

}
