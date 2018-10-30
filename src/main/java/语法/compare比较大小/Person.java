package 语法.compare比较大小;


/**
 * 比较有2中方式：
 * 1. 内比较：也就是类实现比较接口
 * 2. 外比较：为了减少侵入性，不修改源代码，使用外置比较器
 */


// 这里使用内比较，主要缺点是侵入性。即需要修改源代码
class Person implements Comparable<Person>
{
    public int age;
    public String name;

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person obj)
    {
        Person pp = obj;
        if (this.age < pp.age)
            return -1;
        if (this.age == pp.age)
            return 0;
        return 1;
    }

    public void Show()
    {
        System.out.println("我的名字是 " + this.name + "，我今年" + this.age + "岁了");
    }

}