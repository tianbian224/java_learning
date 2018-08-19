package 语法.lambda表达式;//  Lvcang created at  2018-02-05 21:48,have fun~

import java.util.Arrays;
import java.util.Comparator;

interface Ivcang
{
    public int haha(int a, int b);
}

/**
 * 练习使用lambda表达式
 */
public class LambdaTest
{
    //不使用lambda表达式
    public static void test()
    {
        Person[] persons = {new Person(12, "cat"), new Person(24, "dog"), new Person(36, "pig")};
        Arrays.sort(persons, new Comparator<Person>()
        {
            public int compare(Person o1, Person o2)
            {
                if (o1.age == o2.age)
                    return o1.name.compareTo(o2.name);
                return o1.age - o2.age;
            }
        });
    }

    /**
     * 使用lambda表达式的语法：java8 可以使用

    public static void testa()
    {
        //1. lambda表达式是接口对象，只能赋值给接口
        Comparator<Person> comparator = (o1, o2) ->
        {
            if (o1.age == o2.age)
                return o1.name.compareTo(o2.name);
            return o1.age - o2.age;
        };

        //2. labmda的结果就是一个对象,可以强制类型转换,但是只能转化为接口
        Object obj = (Runnable) () ->
        {
            for (int i = 0; i < 1000; i++)
            {
                System.out.println(i);
            }
        };

        // 3. lambda 表达式可以使用已有方法
        Ivcang com = (o1, o2) -> Math.max(o1, o2);// 类方法
        Person pp = new Person(78, "");
        Ivcang ins = (a, b) -> pp.show(a, b);// 实例方法，还可以引用构造函数

    }
     */

}

