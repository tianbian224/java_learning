package 语法.io.Reader基类.FileReader练习;

import java.io.FileReader;
import java.io.IOException;

public class FileReader___Demo
{

	public static void main(String[] args)throws IOException
	{
		FileReader fReader=new FileReader("aa.txt");
		
		//方式1
		int num=0;
//		int cishu=100;
//		while(num!=-1&&cishu>0)
//		{
//			num=fReader.read();
//			cishu--;
//			System.out.print((char)num);
//		}
		//方式2
		char[] buffer=new char[1024];//1K
		while((num=fReader.read(buffer))!=-1)
		{
			System.out.println(new String(buffer,0,num));
		}
		fReader.close();
	}

}
