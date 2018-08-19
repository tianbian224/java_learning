package 语法.序列化验证;

import java.io.Serializable;

/*
 * 这个类没有用处，仅仅是为了测试对象的的持久化
 * 
 * @serial 用于序列化
 */
public class UsedToSerialize implements Serializable
{
	private String name;
	transient private int age;// 加上transient就不被序列化
	public static String dep = "计算机系";
	// 静态成员不能序列化，写入文件的时候，修改dep,实际上只是修改了方法区内容，堆内存中 对象并没有修改，再次读取对还是原始的没有被修改的文件

	static final long serialVersionUID = 100L;// 声明一个字节的UID

	public UsedToSerialize(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "姓名是：" + name + "\r\n年龄是：" + dep;
	}
}
