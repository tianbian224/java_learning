package tcp_udp.UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerUDP
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("������");
		byte[] buffer = new byte[1024];
		DatagramPacket p = new DatagramPacket(buffer, buffer.length);
		DatagramSocket socket = new DatagramSocket(12345);
		socket.receive(p);
		System.out.println(new String(p.getData()));
		socket.close();
	}

}
