package 语法.多态.多态之继承.final类与编译期错误;


// 断子断孙类
public final class Cat extends Animal
{

    @Override
    public void Move()
    {
        System.out.println("Cat==move");
    }

}
