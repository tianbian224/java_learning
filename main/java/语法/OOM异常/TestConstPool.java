package 语法.OOM异常;

import java.util.ArrayList;

//OOM测试：测试常量池溢出

// JDK 1.6会产生异常，JDK1.7不会产生异常
public class TestConstPool
{
	public static void main(String[] args) throws InterruptedException
	{

		Long i = 0l;
		ArrayList<String> list = new ArrayList<String>();
		while (true)
		{
			list.add(String.valueOf(i++).intern());
			System.out.println(i);
			i++;
		}
	}
}
