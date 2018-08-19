package 语法.io.FileWriter练习;

import java.io.FileWriter;
import java.io.IOException;

public class Pro
{

	public static void main(String[] args)
	{
		FileWriter fr=null;
		try
		{
			fr=new FileWriter("aa.txt");
			fr.write("lvc");
			fr.flush();
			//fr.append("lhh");//追加到流
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			try
			{
				fr.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
			
		
	}

}
