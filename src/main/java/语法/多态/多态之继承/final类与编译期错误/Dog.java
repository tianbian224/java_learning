package 语法.多态.多态之继承.final类与编译期错误;

public class Dog extends Animal
{
	@Override
	public void Move()
	{
		System.out.println("Dog===Move");
	}

	public void Eat()
	{
		System.out.println("狗吃骨头");
	}
}
