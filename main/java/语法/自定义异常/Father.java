package 语法.自定义异常;

public class Father
{
	String nameString;
	int age;
	public Father(int age)
	{
		this.nameString="名字";
		this.age=age;
	}
	
	public void FuncAAAA(int num)throws MyException,HisException
	{
		if (num==1)
		{
			throw new MyException("");
		}
		if (num==2)
		{
			throw new HisException("");
		}
	}
}
