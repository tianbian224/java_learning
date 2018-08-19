package 语法.多态.多态之继承.父类构造器中有this;


/**
 * 语法误区：
 * 构造函数之前已经有了对象，还没有初始化。
 * 构造函数是为了初始化内存中相关的字段。已经有了子类对象，父类构造器初始化继承的父类字段，子类构造器初始化子类字段
 * 哪个对象调用函数，函数中的this就是谁
 *
 */
public class Person
{
	public int age;
	public String name;

	public Person()
	{
		this.name = "父类的名字";
		System.out.println("父类的构造函数-----" + this);
		// this 是子类，因为子类在构造构造函数前已经存在，子类对象调用父类构造器初始化继承的字段
	}

	public static void main(String[] sac)
	{
		Teacher teacher = new Teacher();
		System.out.println(teacher.name);
	}
}

class Teacher extends Person
{
	public Teacher()
	{
		this.age = 90;
		this.name = "子类名字";
	}

}
