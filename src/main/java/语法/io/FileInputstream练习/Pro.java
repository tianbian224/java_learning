package 语法.io.FileInputstream练习;

import java.io.FileInputStream;
import java.io.IOException;

public class Pro
{

	public static void main(String[] args) throws IOException
	{
		// FileInputStream1();
		// FileInputStream2();
		FileInputStream3();
	}

	public static void FileInputStream1() throws IOException
	{
		FileInputStream fiStream = new FileInputStream("ii.txt");
		int i = 0;
		while ((i = fiStream.read()) != -1)//读一个字节
		{
			System.out.println((char) i);
		}
		fiStream.close();
	}

	public static void FileInputStream2() throws IOException
	{
		FileInputStream fiStream = new FileInputStream("ii.txt");
		byte[] buffer = new byte[1024];
		int num = 0;
		while ((num = fiStream.read(buffer)) != -1)// 读取字节数组
		{
			System.out.println(new String(buffer, 0, num));
		}
		fiStream.close();
	}

	public static void FileInputStream3() throws IOException
	{
		FileInputStream fiStream = new FileInputStream("ii.txt");
		byte[] buffer = new byte[fiStream.available()];// 定义一个刚刚好的缓冲区
		int num = 0;
		fiStream.read(buffer);
		System.out.println(new String(buffer));
		fiStream.close();

	}

}
