package 语法.路径问题;

import java.io.*;

public class Test
{

	public static void main(String[] args) throws Exception
	{
		// m1();
		// m2();
		m3();
	}

	// class文件路径：
	// 加上/ 表示相对于bin目录
	// 不加上/ 表示class文件所在路径，也就是bin/子包这个目录
	public static void m1() throws Exception
	{
		InputStream inputStream = Test.class.getResourceAsStream("a.txt");
		InputStreamReader reader1 = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(reader1);
		String line = "";
		while ((line = reader.readLine()) != null)
		{
			System.out.println(line);
		}
		reader.close();
	}

	// File路径
	// 什么路径都不写 默认就是项目路径。
	// 加上 / 是所在盘符的路径
	// 可以自己写绝对路劲
	public static void m2() throws Exception
	{
		File file = new File("/oo.txt");
		System.out.println(file.getAbsoluteFile());
		FileReader reader1 = new FileReader(file);
		BufferedReader reader = new BufferedReader(reader1);
		String line = "";
		while ((line = reader.readLine()) != null)
		{
			System.out.println(line);
		}
		reader.close();
	}

	// classLoader路径问题
	public static void m3() throws Exception
	{

		InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("a.txt");
		InputStreamReader reader1 = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(reader1);
		String line = "";
		while ((line = reader.readLine()) != null)
		{
			System.out.println(line);
		}
		reader.close();
	}

}
