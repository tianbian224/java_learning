package 语法.jvm.反编译;

public class Book
{
	public String name = "JVM";
	public int price = 121;

	public void buy(int a, int b)
	{
		a = 12;
		b = 3;
		a = 12 / 3;
		b = 12 * 2;
		System.out.println(name + "" + a);
	}
}
