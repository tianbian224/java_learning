package 习题;

public class Super
{
	public int i=0;//没有被子类覆盖
	public int j=0;
	public Super(String a)
	{
		System.out.println("A");
		i=1;
		j=1;
	}
	public  Super()
	{
		System.out.println("B");
		i+=2;
		j+=2;
	}
}
