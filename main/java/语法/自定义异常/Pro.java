package 语法.自定义异常;
public class Pro
{

	public static void main(String[] args)
	{
		try
		{
			Funcation(1);
			System.out.println("程序继续执行");
		} 
		catch (MyException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("=============");
			System.out.println(e.getMessage());
			System.out.println("=============");
		}
		catch (HisException e) //可以没有捕获YourException
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally中的代码总是要处理");
		}
	}
	public static void Funcation(int num)throws MyException,HisException
	//产生的异常必须抛出或者内部处理,但是YourException就可以没有抛出声明
	{
		if (num==1)
		{
			//System.out.println("抛出异常信息");
			throw new MyException("抛出普通异常MyException");
		}
		if (num==2)
		{
			throw new YourException("抛出一个RunTimeException的子类异常YourException");
		}
		if (num==3)
		{
			throw new HisException("抛出普通异常HisException");
		}
		
	}
}
