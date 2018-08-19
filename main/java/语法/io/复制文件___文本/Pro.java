package 语法.io.复制文件___文本;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pro
{

	public static void main(String[] args) throws IOException
	{
		copyTextFile("aa.txt","aa_copy.txt");
	}
	public static void copyTextFile(String filePath,String destPath) throws IOException
	{
		FileReader fReader=new FileReader(filePath);
		FileWriter fWriter=new FileWriter(destPath);
		char[] buffer=new char[1024];//1k
		int readNum=0;
		while ((readNum=fReader.read(buffer))!=-1)
		{
			fWriter.write(buffer,0,readNum);
		}
		fReader.close();
		fWriter.close();
		System.out.print("文件复制完成！");
	}
}
