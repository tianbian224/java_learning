package tcp_udp.Tcp通信;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client
{
    public static void main(String[] args) throws UnknownHostException, IOException
    {
        // Socket socket = new Socket("desktop", 12345);
        Socket socket = new Socket(InetAddress.getLocalHost(), 12345);
        System.out.println("客户端启动……");
        OutputStream stream = socket.getOutputStream();
        BufferedInputStream reader = new BufferedInputStream(System.in);
        byte[] buffer = new byte[1024];
        while (true)
        {
            int num = reader.read(buffer);
            String message = new String(buffer, 0, num);
            System.out.println(message);
            if (message.equals("exit"))
            {
                System.out.println("==========" + message);
                reader.close();
                socket.close();
                break;
            } else
                stream.write(buffer, 0, num);
        }
    }

}

class Testl
{
    public static void main(String Oargs)
    {
        int i = -2000000000;
        System.out.println(i >>> 30);
    }
}