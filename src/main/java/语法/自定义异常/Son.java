package 语法.自定义异常;
//注意子类覆盖父类的方法时，抛出异常的关系
public class Son extends Father
{
	//private int num;
	public  Son(int num)
	{
		super(num);
	}
	//默认找到的是Father（）构造函数，但是Father类写了一个Father（int）
	//这样子类就找不到Father（），所以必须手动指定
	
	public void FuncAAAA(int num)throws MyException
	{
		if (num==1)
		{
			throw new MyException("");
		}
	}
}
