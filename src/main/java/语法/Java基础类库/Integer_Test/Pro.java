package 语法.Java基础类库.Integer_Test;//  Lvcang created at  2018-04-01 12:52,have fun~

public class Pro
{
    public static void main(String[] args)
    {
        function();
        function3();
    }

    // 使用Integer的基本方法
    public static void function()
    {
        // string转换数字
        int a = Integer.parseInt("95959");
        int b = Integer.parseInt("a", 16); // 表示s是16进制
        System.out.println(a + "," + b);

        // 数字转换string
        String c = Integer.toBinaryString(12);
        String d = Integer.toHexString(10);
        String e = Integer.toString(100);
        System.out.println(c + "," + d + "," + e);

        // 获取Integer对象
        int f = Integer.valueOf(10);
        System.out.println(f);
    }

    //创建对象吗？
    public static void function2()
    {
        Integer a = 127;// 自动装箱，在-128~127范围内，不创建对象
        Integer b = 128;// 自动装箱，超出-128~127范围，创建新对象
        Integer c = new Integer(122); // 使用new一定创建新对象

    }

    // 何时相等？
    public static void function3()
    {
        Integer i = new Integer(128);
        Integer i2 = 128;
        System.out.println(i == i2);// false,因为new 一定创建新对象，二者肯定不是一个地址

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);// false，自动装箱超出了范围，不从Cache中取，都是创建新对象

        Integer i7 = 127;
        Integer i8 = 127;
        System.out.println(i7==i8);// true ,没有超出范围，从Cache中取，是同一个位置

        Integer a=127;
        Integer b=Integer.valueOf(127);
        System.out.println(a==b);// true ,valueOf就是自动装箱，在范围内，都是从Cache中获取

        Integer aa=128;
        Integer bb=Integer.valueOf(128);
        System.out.println(aa==bb);// false ,valueOf就是自动装箱,不在范围内创建新对象

        int aaa=10;
        Integer bbb=Integer.valueOf(10);
        System.out.println(aaa==bbb);// true 自动拆箱，比较数字时相等的

    }
}
