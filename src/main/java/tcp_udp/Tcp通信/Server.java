package tcp_udp.Tcp通信;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 客户端
public class Server
{

	public static void main(String[] args) throws Exception
	{
		ServerSocket serverSocket = new ServerSocket(12345);
		Socket socket = serverSocket.accept();
		while (true)
		{
			System.out.println("服务器端启动，开始接受信息………\n");
			InputStream inputStream = socket.getInputStream();
			byte[] buffer = new byte[1024];
			int num = 0;
			while ((num = inputStream.read(buffer)) != -1)
			{
				String message = new String(buffer, 0, num);
				if (message.equals("exit"))
				{
					System.out.println("=========" + message);
					socket.close();
					return;
				} else
					System.out.println(message);
			}
		}
	}
}
