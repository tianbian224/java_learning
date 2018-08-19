package 语法.io.Reader基类.InputStreamReader练习;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

// 字节流到字符流转换类

//功能——父类命名
public class InputStreamReader__Demo
{

	public static void main(String[] args) throws Exception
	{
		InputStream inputStream = System.in;// 键盘
		InputStreamReader reader = new InputStreamReader(inputStream);// 字节装换为字符
		BufferedReader bufferedReader = new BufferedReader(reader);// 包装字符流

		String line = null;
		while ((line = bufferedReader.readLine()) != null)
		{
			if (line.equals("exit"))
			{
				bufferedReader.close();
				return;
			}
			System.out.println(line.toUpperCase());
		}
	}

}
