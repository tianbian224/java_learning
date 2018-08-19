package 语法.自定义异常;
//�Զ���һ��RunTimeException

public class YourException extends RuntimeException
{
	public YourException(String msg)
	{
		super(msg);
	}
}
