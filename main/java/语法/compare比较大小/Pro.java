package 语法.compare比较大小;

// 2018年3月27日10:26:23  复习
/**
 * 比较有2中方式：
 * 1. 内比较：也就是类实现比较接口
 * 2. 外比较：为了减少侵入性，不修改源代码，使用外置比较器
 */

import java.util.Arrays;
import java.util.Comparator;

public class Pro
{

    public static void main(String[] args)
    {

        // 内比较：也就是类实现比较接口
        Person[] ps = new Person[3];
        ps[0] = new Person(23, "");
        ps[1] = new Person(12, "");
        ps[2] = new Person(89, "");
        for (Person p : ps)
        {
            System.out.println(p.age);
        }
        Arrays.sort(ps);
        System.out.println("====================");
        for (Person p : ps)
        {
            System.out.println(p.age);
        }


        // 外比较
        Arrays.sort(ps, new Comparator<Person>()
        {
            @Override public int compare(Person o1, Person o2)
            {
                return o1.age - o2.age;
            }
        });
    }

}
