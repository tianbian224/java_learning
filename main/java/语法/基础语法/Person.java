package 语法.基础语法;//  Lvcang created at  2018-01-31 22:36,have fun~

/**
 * 构造函数调用
 */
public class Person
{
    static final int a=10000000;
    // 字段
    String name;
    int age;

    // getter  setter  相当于C#中的属性
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // 构造函数
    public Person(String name, int age)
    {
        this(name);
        this.age = age;
    }

    public  Person(String name)
    {
       this.name=name;
    }
}
