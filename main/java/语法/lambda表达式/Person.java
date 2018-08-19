package 语法.lambda表达式;//  Lvcang created at  2018-02-05 21:51,have fun~


// 被比较的类
class Person
{
    public int age;
    public String name;

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public Person(int age, int name)
    {
        this.age = age;
        this.age = name;
    }


    public int show(int age,int c)
    {
        System.out.println("我的名字是 " + this.name + "，我今年" + this.age + "岁了");
        return age+c;
    }

}