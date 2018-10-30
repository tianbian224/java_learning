package 语法.多态.多态之继承.父子类方法调用;
// 主要包括变量、函数、构造函数的继承
// 函数有重写（覆盖）
// 构造函数有上溯super
// 里氏转换
// 不能复写父类的静态方法

public class Pro
{

    public static void main(String[] args)
    {

        Animal animal = new Animal();
        animal = new Cat();// 父类可以装子类
        animal.A();

       // assert animal==null;
        Cat cat = (Cat) animal;// 装子类的父类可以强转为子类
        cat.A();

        Animal err = new Animal();
        Cat errcat = (Cat) err;
        errcat.A();


    }

}
