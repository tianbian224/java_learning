package 语法.io.从键盘写入到文件;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;

/*从键盘读取字符，然后将这些字符写入到文件*/
public class Pro
{
	private static BufferedInputStream bufferedInputStream;

	public static void main(String[] args) throws Exception
	{
		while (true)
		{
			bufferedInputStream = new BufferedInputStream(System.in);
			byte[] buffer = new byte[1024];
			int num = bufferedInputStream.read(buffer);
			FileOutputStream fileOutputStream = new FileOutputStream("het.txt", true);
			fileOutputStream.write(buffer, 0, num);
			// bufferedInputStream.close();
			// fileOutputStream.close();
			System.out.println(new String(buffer, 0, num).toUpperCase());
		}

	}

}
