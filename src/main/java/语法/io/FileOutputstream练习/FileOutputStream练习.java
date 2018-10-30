package 语法.io.FileOutputstream练习;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream练习
{

	public static void main(String[] args) throws IOException
	{
		File1();
	}
	
	public static void File1() throws IOException
	{
		FileOutputStream fo=new FileOutputStream("oo.txt");
		fo.write("老江湖".getBytes());
		fo.close();
		System.out.println("д�����");
	}

}
