package 语法.多态.多态之继承.final类与编译期错误;

import java.lang.reflect.Method;

/**
 * 语法点：
 * 1.animal 内部虽然是子类，但是编译期检查方法
 * 2.反射可以执行类方法
 * 3.final类断子绝孙
 *
 */
public class Pro
{

    public static void main(String[] args) throws Exception
    {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Animal animal = new Dog();
        // animal.eat();// 报错，因为编译时期，查阅animal没有eat方法，报错，运行时是dog，那就可以运行eat方法
        reflect();// 通过反射发现可以使用eat方法
    }

    public static void reflect() throws Exception
    {
        Animal animal = new Dog();
        // Method[] methods = animal.getClass().getMethods();
        // for (Method mm : methods)
        // {
        // System.out.println(mm.getName());
        // }
        Method method = animal.getClass().getMethod("Eat", null);
        method.invoke(animal, null);
    }

}
