package 语法.自定义异常;
public class MyException extends Exception
{
	String mesString;
	public MyException(String  message)
	{
		this.mesString=message;
	}
	public String getMessage()//这个函数JVM会自动调取
	{
		return mesString;
	}
}
